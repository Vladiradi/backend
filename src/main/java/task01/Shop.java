package task01;


//
// 1 уровень сложности: 1. У вас в магазине распродажа. К вам набежало 10 000 клиентов
// и вы пытаетесь корректно всех обслужить с учетом того,
//что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно карантинным нормам)
//и время обслуживания одного покупателя занимает 30 секунд(откорректируйте под себя). Сымитируйте данный процесс
//работы и подсчитайте за какой период времени вы сможете обслужить данный объем покупателей?
//Отдельный покупатель - отдельный поток. Какой синхронизатор с библиотеки concurrent Вы бы использовали?

import java.util.concurrent.*;
import java.util.concurrent.Executors;


public class Shop {
    private static final int MAX_CAPACITY = 10;
    private static final int TOTAL_CUSTOMERS = 10000;
    private static final int SERVICE_TIME_SECONDS = 1;

    public static void main(String[] args) throws InterruptedException {
        Semaphore shop = new Semaphore(MAX_CAPACITY, true);
        ExecutorService pool = Executors.newFixedThreadPool(100);
        CountDownLatch latch = new CountDownLatch(TOTAL_CUSTOMERS);
        long startTime = System.currentTimeMillis();


        for (int i = 0; i < TOTAL_CUSTOMERS; i++) {
            int customerId = i;
            pool.submit(() -> {
                try {
                    shop.acquire();
                    System.out.println("Customer #" + customerId + " entered the shop.");
                    TimeUnit.SECONDS.sleep(SERVICE_TIME_SECONDS);
                    System.out.println("Customer #" + customerId + " left the shop.");
                    shop.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            });



        }

        latch.await();
        pool.shutdown();


    }
}
