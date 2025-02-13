//Получить целое число с консоли.
//Проверить, делится ли число на 2 и 3 одновременно, 5 и 7 одновременно, 3 и 5  одновременно без остатка.
//Использовать форматированный(System.out.printf) вывод для этого.
//Продебажить

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.printf("%d делится на 2 и 3 одновременно.%n", number);
        } else {
            System.out.printf("%d не делится на 2 и 3 одновременно.%n", number);
        }
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.printf("%d делится на 5 и 7 одновременно.%n", number);
        } else {
            System.out.printf("%d не делится на 5 и 7 одновременно.%n", number);
        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("%d делится на 3 и 5 одновременно.%n", number);
        } else {
            System.out.printf("%d не делится на 3 и 5 одновременно.%n", number);
        }
        input.close();
    }
}

