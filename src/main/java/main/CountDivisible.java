//3*.Посчитайте количество всех целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
//которые делятся на введенное пользователем число number без отстатка.
//        Просчитайте время, которое необходимо для вычисления данного результата в одном потоке.
//        Просчитайте время, которое необходимо пользователю для выполнения этих задачи паралельно,
//количество создаваемых потоков countThreads пользователь тоже должен ввести вручную .


package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class CountDiv {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делитель number: ");
        int divider = scanner.nextInt();
        System.out.print("Введите количество потоков: ");
        int countThreads = scanner.nextInt();

        long startSingle = System.currentTimeMillis();
        long singleCounter = 0;
        for (long i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (i % divider == 0) {
                singleCounter++;
            }
        }
        long endSingle = System.currentTimeMillis();
        System.out.println("Однопоточный результат: " + singleCounter);
        System.out.println("Время в 1 поток: " + (endSingle - startSingle) + " мс");

        long startMulti = System.currentTimeMillis();
        long range = ((long) Integer.MAX_VALUE - (long) Integer.MIN_VALUE + 1) / countThreads;

        List<DividerCounterThread> threads = new ArrayList<>();
        for (int i = 0; i < countThreads; i++) {
            long start = (long) Integer.MIN_VALUE + i * range;
            long end = (i == countThreads - 1) ? (long) Integer.MAX_VALUE : start + range - 1;
            DividerCounterThread thread = new DividerCounterThread(start, end, divider);
            threads.add(thread);
            thread.start();
        }

        long total = 0;
        for (DividerCounterThread thread : threads) {
            thread.join();
            total += thread.getResult();
        }

        long endMulti = System.currentTimeMillis();
        System.out.println("Многопоточный результат: " + total);
        System.out.println("Время в " + countThreads + " потоков: " + (endMulti - startMulti) + " мс");
    }

    static class DividerCounterThread extends Thread {
        private final long start;
        private final long end;
        private final int divider;
        private long result = 0;

        public DividerCounterThread(long start, long end, int divider) {
            this.start = start;
            this.end = end;
            this.divider = divider;
        }

        public long getResult() {
            return result;
        }

        @Override
        public void run() {
            for (long i = start; i <= end; i++) {
                if (i % divider == 0) {
                    result++;
                }
            }
        }
    }
}
