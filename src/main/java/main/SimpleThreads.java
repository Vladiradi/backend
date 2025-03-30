//1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное
//        введенной цифре, нумеруете их и запускаете на выполнение.
//        Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100 милисекунд перед каждым выводом.
//        Сделайте так, чтобы главный поток выполнения программы не завершился до окончания работы всех дочерних потоков.



package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SimpleThreads {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Task 1. enter amount of threads you need:");
        int count = scanner.nextInt();
        scanner.close();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    System.out.println("Thread " + threadNumber + " is running.");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            threads.add(thread);
            thread.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println("All threads finished");

    }
    }





