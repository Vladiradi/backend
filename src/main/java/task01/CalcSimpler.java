package task01;
//1. Напишите программу просчета количества всех простых в диапазоне до 1 000 000.
//        Просчет выполняйте в 4 потоках, которые создаются с помощью Callable.
//        Получите результаты подсчета из каждого потока и напечатайте общий результат.
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CalcSimpler {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int limit = 1_000_000;
        int threads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        List<Future<Integer>> results = new ArrayList<>();

        for (int i = 0; i < threads; i++) {
            int start = (int) Math.floor((double) i * limit / threads) + 1;
            int end = (int) Math.floor((double) (i + 1) * limit / threads);



            Callable<Integer> task = () -> {
                int count = 0;
                for (int n = start; n <= end; n++) {
                    if (isPrime(n)) count++;
                }
                return count;
            };

            results.add(executor.submit(task));
        }
        int total = 0;
        for (Future<Integer> result : results) {
            total += result.get();
        }

        executor.shutdown();
        System.out.println("Total " + limit + ": " + total);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

