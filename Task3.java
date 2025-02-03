import java.util.Scanner;

public class Task3 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String text = scanner.nextLine();

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        System.out.println("Введите булево значение (true/false):");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("Введите длинное число:");
        long longNumber = scanner.nextLong();

        System.out.println("Введите дробное число:");
        double doubleNumber = scanner.nextDouble();

        System.out.println("\nВы ввели:");
        System.out.println("Строка: " + text);
        System.out.println("Целое число: " + number);
        System.out.println("Булево значение: " + boolValue);
        System.out.println("Длинное число: " + longNumber);
        System.out.println("Дробное число: " + doubleNumber);
    }
}