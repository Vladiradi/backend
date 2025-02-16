//Реализуйте программу, которая попросит пользователя ввести три целых числа
//        (используйте сканер) и напечатает максимум из трех чисел.

import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Максимальное число: " + max);
        scanner.close();
    }
}