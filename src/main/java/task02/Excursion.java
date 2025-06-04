package task02;
//2*. Вы едете на экскурсии. Каждый человек, при входе в автобус, называет свою фамилию.
//Экскурсовод ставит у себя в блокноте птичку и если количество людей по списку совпадает
//автобус уезжает на экскурсию. Сымитируйте данный процесс работы.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

import java.util.concurrent.CountDownLatch
public class Excursion {
    public static void main(String[] args) throws InterruptedException {
        int tourists = 10;
        CountDownLatch latch = new CountDownLatch(tourists);

        for (int i = 1; i <= tourists; i++) {


    }

}

//import java.util.concurrent.CountDownLatch;
//
//public class ExcursionSimulation {
//    public static void main(String[] args) throws InterruptedException {
//        int touristsCount = 5;
//        CountDownLatch latch = new CountDownLatch(touristsCount); // счётчик на 5 человек
//
//        for (int i = 1; i <= touristsCount; i++) {
//            final int touristNumber = i;
//            new Thread(() -> {
//                System.out.println("Турист #" + touristNumber + " назвал фамилию.");
//                latch.countDown(); // уменьшает счётчик
//            }).start();
//        }
//
//        System.out.println("Экскурсовод ждёт, пока все войдут в автобус...");
//        latch.await(); // ждём, пока все вызовут countDown()
//        System.out.println("Все туристы на месте. Автобус уезжает на экскурсию!");
//    }
//}