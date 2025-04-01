package telran;

import java.util.concurrent.locks.Lock;

class ThreadTask extends Thread {
    private Account account;
    private Account accountTax;
    private int sum;
    private Lock lock;
    private Lock lockTax;

    public ThreadTask(Account account, Account accountTax, int sum, Lock lock, Lock lockTax) {
        this.account = account;
        this.accountTax = accountTax;
        this.sum = sum;
        this.lock = lock;
        this.lockTax = lockTax;
    }

    @Override
    public void run() {
        // Увеличиваем сумму на основном счете и отчисляем налог
        for (int i = 0; i < 100000; i++) {
            lock.lock(); // для синхронизации работы с основным счетом
            try {
                account.plusSum(sum); // Увеличиваем основной баланс
            } finally {
                lock.unlock(); // Освобождаем блокировку основного счета
            }

            // Отчисляем налог на другой счет
            lockTax.lock(); // для синхронизации работы с налоговым счетом
            try {
                accountTax.plusSum((int) (sum * 0.1)); // Отчисляем 10% на налоговый счет
            } finally {
                lockTax.unlock(); // Освобождаем блокировку налогового счета
            }
        }
    }
}