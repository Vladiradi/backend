package task01;
//1. На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
//        Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
//        но что-то пошло не так. Исправь программу, чтобы другие потоки "видели" изменения значения
//        переменной isHit и больше его не меняли. Как только мишень разрушена кем то из стрелков,
//        соревнования прекращаются. Подумайте, можно ли использовать класс AtomicBoolean?
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Shooting {


    private static final AtomicBoolean isHit = new AtomicBoolean(false);

    public static void main(String[] args) {
        Thread[] shooters = new Thread[5];

        for (int i = 0; i < shooters.length; i++) {
            int shooterNumber = i + 1;
            shooters[i] = new Thread(() -> shoot(shooterNumber));
            shooters[i].start();
        }
    }

    private static void shoot(int shooterId) {

        try {
            Thread.sleep(new Random().nextInt(1000)); // случайная задержка до 1 секунды
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        boolean hit = new Random().nextBoolean(); // 50/50 шанс попадания

        if (hit) {
            if (isHit.compareAndSet(false, true)) {
                System.out.println("Стрелок #" + shooterId + " попал в мишень и разрушил её!");
            } else {
                System.out.println("Стрелок #" + shooterId + " тоже попал, но мишень уже разрушена.");
            }
        } else {
            System.out.println("Стрелок #" + shooterId + " промахнулся.");
        }
    }
}
