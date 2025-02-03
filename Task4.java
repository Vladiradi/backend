import java.util.Scanner;

public class Task4 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;

        System.out.println("\nРезультаты:");
        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
    }
}