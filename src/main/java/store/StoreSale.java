package store;
//2*. В одном из предыдущий ДЗ у вас была задача:
//        У вас в магазине распродажа. К вам набежало 10 000 клиентов и вы пытаетесь корректно всех обслужить с
//        учетом того, что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно
//        карантинным нормам) и время обслуживания одного покупателя занимает 30 секунд.
//        Сымитируйте данный процесс работы и подсчитайте за какой период времени вы сможете обслужить данный
//        объем покупателей?
//        Отдельный покупатель - отдельный поток.
//        Можно было бы реализовать данную задачу не используя семафор?
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StoreSale {
    private static final int NUM_CUSTOMERS     = 10_000;
    private static final int MAX_INSIDE        = 10;
    private static final int SERVICE_TIME_MS   = 30_000;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(MAX_INSIDE);
        CountDownLatch latch = new CountDownLatch(NUM_CUSTOMERS);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < NUM_CUSTOMERS; i++) {
            pool.submit(() -> {
                try {

                    Thread.sleep(SERVICE_TIME_MS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);

        long elapsedMs = System.currentTimeMillis() - startTime;
        long seconds   = elapsedMs / 1_000;
        long hours     = seconds / 3_600;
        long minutes   = (seconds % 3_600) / 60;
        long secs      = seconds % 60;

        System.out.printf(
                "All %d clients was served for %dh %dm %ds%n",
                NUM_CUSTOMERS, hours, minutes, secs
        );
    }
}