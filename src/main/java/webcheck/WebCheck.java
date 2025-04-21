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
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WebCheck {

    private final ScheduledExecutorService scheduler =
            Executors.newSingleThreadScheduledExecutor();
    private final HttpClient client = HttpClient.newHttpClient();
    private final String WEBSITE = "https://skilldesk.starta.university/";
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public void start() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(WEBSITE))
                            .GET()
                            .build();

                    HttpResponse<Void> response = client.send(
                            request, HttpResponse.BodyHandlers.discarding());

                    System.out.printf("[%s] Site status: %d%n",
                            LocalDateTime.now().format(formatter), response.statusCode());
                } catch (Exception e) {
                    System.err.printf("[%s] Error: %s%n",
                            LocalDateTime.now().format(formatter), e.getMessage());
                }
            }
        };
        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.MINUTES);
        System.out.println("Main Thread is free");
    }

    public static void main(String[] args) {
        new WebCheck().start();
    }
}



















