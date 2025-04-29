//1. Представьте, что Вы ревьювите код в классе, который написал Ваш коллега.
//        Вас не устраиват реализация некоторых методов в классе, характеристик и есть
//        даже замечания по реализации самого класса.
//        Вам нужно создать аннотацию, которой Вы можете пометить вышеуказанные участки кода,
//        указать в ней ФИО ревьювера и написать в ней комментарий, в чем же Вы видите проблему.

//Здесь я сделал ревью собственного телеграмм бота тестовая версия

package annotation;
import java.util.Map;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import java.util.Map;
import annotation.Review;

@Review(
        reviewedBy = "Vladimir Ryzhov",
        comment = "duplicate Map imports and very not optimized functionality — the principle of SO single responsibility is violated"
)


public class TelegramBot extends MultiSessionTelegramBot {
    public static final String NAME = "JavaTelegramTestBot";
    public static final String TOKEN = "";
@Review(
        reviewedBy = "Vladimir Ryzhov",
        comment = "its not safe to keep TOKEN in code, I need use special environment-variable  or  use config"
)
    public TelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    @Review(
            reviewedBy = "Vladimir Ryzhov",
            comment = "много последовательных if’ов по одинаковой логике. Рекомендую:
  - Вынести логику работы с сообщениями в отдельный сервис/компонент
  - Проверять null для getMessageText() и getCallbackQueryButtonKey() во избежание NPE."
    )

    public void onUpdateEventReceived(Update updateEvent) {
        if (getMessageText().equals("/start")) {
            sendTextMessageAsync("Hi there!");
        }
        if (getMessageText().equals("/stop")) {
            sendTextMessageAsync("Goodbye!");
        }
        if (getMessageText().contains("How are you ?")) {
            sendTextMessageAsync("I'm fine, thanks!");
        }
        if (getMessageText().equals("/bye")) {
            sendTextMessageAsync("Asta la vista, baby!");
        }
        if (getMessageText().contains("photo")) {
            sendPhotoMessageAsync("final_pic");
        }
        if (getMessageText().contains("picture")) {
            sendPhotoMessageAsync("step_1_pic");
        }

        if (getMessageText().contains("cat")) {
            sendTextMessageAsync("choose cat number",
                    Map.of("Cat 1",  "cat1", "Cat 2",  "cat2"));
        }

        if (getCallbackQueryButtonKey().equals("cat1")) {
            sendPhotoMessageAsync("step_1_pic");
        }
        if  (getCallbackQueryButtonKey().equals("cat2")) {
            sendPhotoMessageAsync("step_2_pic");
        }

        if (getMessageText().equals("smile")) {
            var message = getLastSentMessage();
            editTextMessageAsync(message.getMessageId(), message.getText()+ " :)  ");

        }


    }

    @Review(
            reviewedBy = "Vladimir Ryhov",
            comment    = "main содержит регистрацию бота прямо в коде, вынести в конфигурационный класс или builder, убрать throws из сигнатуры и централизовать обработку исключений."
    )

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}