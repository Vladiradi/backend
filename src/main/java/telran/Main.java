package telran;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(); // Основной счет
        Account accountTax = new Account(); // Налоговый счет

        Lock lock = new ReentrantLock();  // Блокировка для основного счета
        Lock lockTax = new ReentrantLock();  // Блокировка для налогового счета

        // Создание и запуск нескольких потоков
        ThreadTask task1 = new ThreadTask(account, accountTax, 10, lock, lockTax);
        ThreadTask task2 = new ThreadTask(account, accountTax, 15, lock, lockTax);
        ThreadTask task3 = new ThreadTask(account, accountTax, 20, lock, lockTax);

        task1.start(); // Запуск первого потока
        task2.start(); // Запуск второго потока
        task3.start(); // Запуск третьего потока

        // Ожидаем завершения всех потоков
        task1.join();
        task2.join();
        task3.join();

        // Выводим результат
        System.out.println("Основной счёт: " + account.getSum());
        System.out.println("Налоговый счёт: " + accountTax.getSum());
    }
}