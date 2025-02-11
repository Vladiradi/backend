//Создайте класс Converter конвертер системы счисления.
//У пользователя спрашивается число системы счисления,
//(используйте Scanner)
//Запрашивается само число (ожидается корректный ввод)
//У пользователя спрашивается число системы счисления в какую перевести

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную систему счисления (2, 8, 10, 16): ");
        int base = scanner.nextInt();
        System.out.print("Введите число в системе счисления " + base + ": ");
        String number = scanner.next();
        System.out.print("Введите систему счисления для перевода (2, 8, 10, 16): ");
        int targetBase = scanner.nextInt();

        try {
            int decimal = Integer.parseInt(number, base);
            String convertedNumber = Integer.toString(decimal, targetBase).toUpperCase();
            System.out.println("Результат перевода: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
