package lesson
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Создание ExecutorService для управления задачами
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Создание задачи типа Callable, которая вычисляет квадрат числа
        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int number = 10;
                System.out.println("Задача выполняется, вычисляю квадрат числа: " + number);
                return number * number; // Возвращаем результат
            }
        };

        // Передача задачи в ExecutorService и получение результата
        Future<Integer> future = executorService.submit(task);

        // Получение результата, выполнение блокируется до завершения задачи
        Integer result = future.get();

        System.out.println("Результат выполнения задачи: " + result);

        // Завершаем работу ExecutorService
        executorService.shutdown();
    }
}
