package task02;
//Вы пишете книгу и вы автор. Есть 2 человека, которые выступают у вас соавторами.
//На этапе написания книги, они пишут разные главы, помогая таким образом вам полностью ее закончить.
//После того как вы и все соавторы закончили свою работу, вы отправляете книгу на рецензирование.
//В группу рецензентов входит 3 человека, каждый из которых является специалистом в своей области
//и проверяет Вашу книгу на правильность отражения фактов в вашем произведении.
//После того. как все рецензии получены, Вы отправляете книгу в издательский дом.
//В редакции главный редактор и руководитель издательства читают ваше творение и утверждают
//его в печать.
//Вы относите утвержденные рукописи печатникам, они печатают книгу, переплетчики делают ей переплет
//а служба доставки развозят книги по магазинам.
//        Поздравляю Вас, вы полностью прошли все фазы становления известного писателя, т.к. Ваша книга
//стала бестселлером! )
//        Создайте приложение, которое сымитирует работу процесса создания книги, с учетом что каждый человек,
//который встречается в описаной схеме будет представлен отдельным потоком.
//Какой синхронизатор с библиотеки concurrent мог бы быть Вам полезен при выполнении данной задачи?




import java.util.concurrent.CountDownLatch;

public class Book {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch authorsDone = new CountDownLatch(3);
        CountDownLatch reviewersDone = new CountDownLatch(3);
        CountDownLatch editorsDone = new CountDownLatch(2);

        // Авторы
        for (int i = 1; i <= 3; i++) {
            int id = i;
            new Thread(() -> {
                System.out.println("Автор #" + id + " пишет свою часть...");
                sleep(1000);
                System.out.println("Автор #" + id + " закончил.");
                authorsDone.countDown();
            }).start();
        }

        // Главный поток ждет авторов
        authorsDone.await();
        System.out.println("Все главы написаны. Отправляем на рецензию...");

        // Рецензенты
        for (int i = 1; i <= 3; i++) {
            int id = i;
            new Thread(() -> {
                System.out.println("Рецензент #" + id + " проверяет главу...");
                sleep(1000);
                System.out.println("Рецензент #" + id + " закончил проверку.");
                reviewersDone.countDown();
            }).start();
        }

        reviewersDone.await();
        System.out.println("Рецензии получены. Книга отправлена в издательство...");

        // Издательство
        for (int i = 1; i <= 2; i++) {
            String role = (i == 1) ? "Главный редактор" : "Директор издательства";
            new Thread(() -> {
                System.out.println(role + " читает книгу...");
                sleep(1000);
                System.out.println(role + " утвердил книгу.");
                editorsDone.countDown();
            }).start();
        }

        editorsDone.await();
        System.out.println("Книга утверждена! Печать...");

        // Печать -> Доставка
        Thread printer = new Thread(() -> {
            System.out.println("Печатник печатает книгу...");
            sleep(1000);
            System.out.println("Печать завершена.");
        });

        Thread binder = new Thread(() -> {
            try {
                printer.join();
                System.out.println("Переплетчик делает переплет...");
                sleep(1000);
                System.out.println("Переплет готов.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread delivery = new Thread(() -> {
            try {
                binder.join();
                System.out.println("Служба доставки развозит книги...");
                sleep(1000);
                System.out.println("Книги доставлены!");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        printer.start();
        binder.start();
        delivery.start();

        delivery.join();
        System.out.println("Поздравляем! Книга стала бестселлером!");
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
