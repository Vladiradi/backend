package warehouse;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;




//На склад приезжает машина, в которой загружено N ящиков (пользователь вводит с клавиатуры).
//Автоматизированный разгрузчик вытягивает с машины ящик и ложит на рампу с определенным интервалом времени,
//на которой может одновременно разместиться например 2 ящика.
//В это время подъезжает автоматизированный погрузчик и везет его на место хранения. Он за раз может взять всего
//1 ящик. Каждый участник процесса представлен в виде отдельного потока Java.
//        Создайте программу, которая синхронизирует работу в данном процессе разгрузки автомобиля, с условием того,
//что Разгрузчик может быть только один, а Погрузчиков может быть 2 и более (на ваше усмотрение).

public class Warehaus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number of box you need ? :");
        int boxes = scanner.nextInt();


        System.out.println("What number of loader you need ? :");
        int loaders = scanner.nextInt();

        scanner.close();
        Ramp ramp = new Ramp(2);

        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= loaders; i++) {
            Thread t = new Thread(new Loader(ramp, i));
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }

    }
