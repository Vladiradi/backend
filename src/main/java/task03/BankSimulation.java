package task03;
//Вы открыли банк. У вас есть массив из 100 счетов клиентов. На каждом клиентском счете 1000 евро.
//Просчитайте общее количество денег на счетах клиентов.
//Представьте что за день, у вас в банке было проведено 10 000 операций.
//В каждой операции вы выбираете 2 случайных счета:
//с одного снимаете сумму например 10 евро и добавляете на другой счет эту же сумму.
//Просчитайте общее количество денег на счетах клиентов.
//У вас баланс денежных средств на счетах клиентов до начала операций должен быть равен количеству денег после окончание дня.
//Если это не так, то как Вы думаете почему?  Можно ли это исправить и как?
import java.util.Random;

public class BankSimulation {

    private static final int ACCOUNT_COUNT = 100;
    private static final int INITIAL_BALANCE = 1000;
    private static final int TRANSFER_AMOUNT = 10;
    private static final int OPERATIONS = 10_000;

    private static final int[] accounts = new int[ACCOUNT_COUNT];

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < ACCOUNT_COUNT; i++) {
            accounts[i] = INITIAL_BALANCE;
        }




        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> performTransfers(OPERATIONS / threads.length));
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }


        int total = getTotalBalance();
        System.out.println(" money on  accouns ✅: " + total + " euro");
        System.out.println("check amount ✅ : " + (ACCOUNT_COUNT * INITIAL_BALANCE) + " euro");

        if (total != ACCOUNT_COUNT * INITIAL_BALANCE) {
            System.out.println(" loss money ! Problem with sync");
        } else {
            System.out.println("All done!");
        }
    }

    private static void performTransfers(int operationCount) {
        Random random = new Random();
        for (int i = 0; i < operationCount; i++) {
            int from = random.nextInt(ACCOUNT_COUNT);
            int to = random.nextInt(ACCOUNT_COUNT);
            if (from != to) {
                transferMoney(from, to, TRANSFER_AMOUNT);
            }
        }
    }

    private static void transferMoney(int from, int to, int amount) {

        int first = Math.min(from, to);
        int second = Math.max(from, to);

        synchronized (getLock(first)) {
            synchronized (getLock(second)) {
                if (accounts[from] >= amount) {
                    accounts[from] -= amount;
                    accounts[to] += amount;
                }
            }
        }
    }

    private static Object getLock(int index) {
        return Integer.valueOf(index);
    }

    private static int getTotalBalance() {
        int sum = 0;
        for (int balance : accounts) {
            sum += balance;
        }
        return sum;
    }
}