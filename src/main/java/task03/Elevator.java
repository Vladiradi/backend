package task03;
//3*. Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек.
//Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).
//Каждый человек - отдельный поток.
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Elevator {
    private static final int MAX_CAPACITY = 5;
    private static final Semaphore semaphore = new Semaphore(MAX_CAPACITY, true);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people in the GROUP? :   ");
        int personCount = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= personCount; i++) {

            int personId = i;
            Thread thread = new Thread(() -> {
                try {
                    System.out.println(" Person #:" + personId + " wait ");
                    semaphore.acquire();
                    System.out.println(" Person #:" + personId + "  enter ->");
                    Thread.sleep(3000);
                    System.out.println("Person #:" + personId + "   out");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
          thread.start();
        }
    }
}


