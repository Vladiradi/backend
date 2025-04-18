// 1. У вас есть задача проверять какой то сайт, с целью проверки опубликования
//на нем новой информации, но если мы будем слишком часто проверять этот сайт,
//то нас могут "забанить" за спам. Чтобы избежать этого, вы должны слать свои запросы
//не чаще чем один раз в минуту.
//Ваша задача должна работать паралельно основной функциональности и не занимать ресурсы
//главного потока.
//Подумайте, какой механизм Java вы могли бы использовать для автоматизации данной задачи.
//Как реализацию работы с сайтом, просто выведите сообщение о том, что соединение
//установлено и выведите текущее время.
package webcheck;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class WebCheck {
    private static final String WEBSITE_URL = "https://www.skilldesk.starta.university";

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool();

        Runnable task = () -> {
            try {
                URL url = new URL(WEBSITE_URL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            }
        }
    }
}




//
//public class WebCheck {
//
//    private static final String WEBSITE_URL = "https://goose.yea.su";
//
//    public static void main(String[] args) {
//        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
//
//        Runnable checkWebsiteTask = () -> {
//            try {
//                URL url = new URL(WEBSITE_URL);
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setRequestMethod("GET");
//                connection.setConnectTimeout(5000); // 5 секунд на соединение
//                connection.connect();
//
//                int statusCode = connection.getResponseCode();
//                System.out.println("[" + LocalDateTime.now() + "] Статус сайта: " + statusCode);
//
//                connection.disconnect();
//            } catch (IOException e) {
//                System.out.println("[" + LocalDateTime.now() + "] Ошибка при подключении: " + e.getMessage());
//            }
//        };
//
//        scheduler.scheduleAtFixedRate(checkWebsiteTask, 0, 60, TimeUnit.SECONDS);
//
//        System.out.println("Главный поток работает независимо от проверок...");
//    }
//}

