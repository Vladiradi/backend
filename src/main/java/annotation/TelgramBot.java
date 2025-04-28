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

public class TelegramBot extends MultiSessionTelegramBot {
    public static final String NAME = "JavaTelegramTestBot";
    public static final String TOKEN = "";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
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

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}