import java.util.Scanner;
public class Task2 {
    public void execute() {
        System.out.println("\nTask 2: Разбиение числа");

        int number = getInputNumber();
        if (isValidThreeDigitNumber(number)) {
            printDigits(number);
        } else {
            System.out.println("Введите трехзначное число!");
        }
    }

    private int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        return scanner.nextInt();
    }

    private boolean isValidThreeDigitNumber(int number) {
        return number >= 100 && number <= 999;
    }

    private void printDigits(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        System.out.printf("Число %d -> %d, %d, %d%n", number, hundreds, tens, units);
    }
}