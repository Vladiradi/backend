//№2
//Реализовать программу, выводящую на экран результаты:
//Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();
        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
        scanner.close();
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return b != 0 ? a / b : Double.NaN;
    }
}
