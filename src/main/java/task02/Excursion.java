kage task02;
//2*. Вы едете на экскурсии. Каждый человек, при входе в автобус, называет свою фамилию.
//Экскурсовод ставит у себя в блокноте птичку и если количество людей по списку совпадает
//автобус уезжает на экскурсию. Сымитируйте данный процесс работы.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

import java.util.concurrent.CountDownLatch;
public class Excursion {
    public static void main(String[] args) throws InterruptedException {
        int tourists = 10;
        CountDownLatch latch = new CountDownLatch(tourists);

        for (int i = 1; i <= tourists; i++) {
            int touristId = i;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Tourist #" + touristId + "  checked");
                    latch.countDown();
                }
            });

            thread.start();

        }
        System.out.println("Driver wait for others... ");
        latch.await();
        System.out.println("Go go go !");
    }

}

