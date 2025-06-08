package task04;

import java.util.concurrent.*;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Кассир в магазине. К нему подходят клиенты с товарам отдают ему деньги и получают сдачу.
//По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
//Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы. Сумма оплаты и
//сумма сдачи может быть сгенерирована случайным образом, чтобы сдача была всегда меньше чем оплата.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

public class Kassa {

    public static void main(String[] args) throws InterruptedException {
        int numClients = 5;
        CountDownLatch latch = new CountDownLatch(numClients);
        ExecutorService executor = Executors.newFixedThreadPool(numClients);

        for (int i = 1; i <= numClients; i++) {
            int clientId = i;
            executor.submit(() -> {
                Random random = new Random();
                int payment = random.nextInt(100) + 1;
                int change = random.nextInt(payment);

                System.out.println("Client #" + clientId + " paid: " + payment + ", change: " + change);
                latch.countDown();
            });
        }

        latch.await();
        System.out.println("Kassa is closing...");
        executor.shutdown();
    }
}
