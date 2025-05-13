package taskthread;


public class PrimeCounterApp {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrimeCounter("Thread-1"));
        Thread t2 = new Thread(new PrimeCounter("Thread-2"));
        Thread t3 = new Thread(new PrimeCounter("Thread-3"));

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(5000);
        t1.interrupt();

        Thread.sleep(5000);
        t2.interrupt();

        Thread.sleep(5000);
        t3.interrupt();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads finished");
    }

    static class PrimeCounter implements Runnable {
        private final String name;

        public PrimeCounter(String name) {
            this.name = name;
        }

        public void run() {
            long count = 0;
            for (int i = 2; i <= 1_000_000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(name + " was interrupted. Prime numbers found: " + count);
                    return;
                }
                if (isPrime(i)) {
                    count++;
                }
                if (i % 100000 == 0) {
                    System.out.println(name + " reached number: " + i);
                }
            }
            System.out.println(name + " finished. Prime numbers found: " + count);
        }

        private boolean isPrime(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }
}