package task04;

//Кассир в магазине. К нему подходят клиенты с товарам отдают ему деньги и получают сдачу.
//По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
//Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы. Сумма оплаты и
//сумма сдачи может быть сгенерирована случайным образом, чтобы сдача была всегда меньше чем оплата.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?


import java.util.concurrent.*;
import java.util.Random;
import task04.Order;

public class Kassa {
    public static void main(String[] args) throws InterruptedException {
        int numCustomers = 5;

        BlockingQueue<Order> order = new LinkedBlockingQueue<>();
        CountDownLatch latch = new CountDownLatch(numCustomers);

    }
}

