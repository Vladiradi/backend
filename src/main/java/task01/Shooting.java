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
        Thread.sleep(new Random().nextInt(1000));
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    boolean hit = new Random().nextBoolean();

    if (hit) {
        if (isHit.compareAndSet(false, true)) {
            System.out.println("Shooter #" + shooterId + "    hit the Target");
        } else {
            System.out.println("Shooter #" + shooterId + "   hit but Target is destroyed");
        }
    } else {
        System.out.println("Shooter #" + shooterId + "   missed");
    }

    }
}

