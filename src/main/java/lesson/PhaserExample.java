package lesson;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        int parties = 3; // количество участников
        Phaser phaser = new Phaser(parties); // создаем фазер с 3 зарегистрированными потоками

        // Запускаем 3 потока
        for (int i = 0; i < parties; i++) {
            new Thread(new Worker(phaser, i)).start();
        }
    }
}

class Worker implements Runnable {
    private final Phaser phaser;
    private final int id;

    public Worker(Phaser phaser, int id) {
        this.phaser = phaser;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Поток " + id + ": Фаза 0 — подготовка");
            Thread.sleep(500 + id * 200); // имитация подготовки
            phaser.arriveAndAwaitAdvance(); // ждём остальных

            System.out.println("Поток " + id + ": Фаза 1 — выполнение задачи");
            Thread.sleep(700 + id * 100); // имитация выполнения
            phaser.arriveAndAwaitAdvance(); // ждём остальных

            System.out.println("Поток " + id + ": Фаза 2 — завершение");
            Thread.sleep(400);
            phaser.arriveAndAwaitAdvance(); // ждём остальных

            System.out.println("Поток " + id + " завершил участие");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
