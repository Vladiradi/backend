//Запустите в 3 потока просчет суммы всех чисел, который без остатка деляться на 17
//        в интервале от 0 до 10 млн. Показывайте на экран, как будет накапливаться сумма по каждому потоку.
//        После запуска просчета, главный поток остановите на 1 секунду и завершите его.
//        Все дочерние потоки должны автоматически закрыться. (Daemons)



package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class DaemonThreads {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread daemonThread = new Thread(new DaemonSumTask(i + 1));
            daemonThread.setDaemon(true);
            daemonThread.start();
        }

        Thread.sleep(1000);
        System.out.println("Главный поток завершён (демоны завершатся автоматически).\n");
    }

    static class DaemonSumTask implements Runnable {
        private final int threadId;

        public DaemonSumTask(int id) {
            this.threadId = id;
        }

        @Override
        public void run() {
            long sum = 0;
            for (int i = 0; i <= 10_000_000; i++) {
                if (i % 17 == 0) {
                    sum += i;
                    if (i % 1_000_000 == 0) {
                        System.out.println("Поток #" + threadId + " накопил: " + sum);
                    }
                }
            }
            System.out.println("Поток #" + threadId + " завершил подсчёт: " + sum);
        }
    }
}
