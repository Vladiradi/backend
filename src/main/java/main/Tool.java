//№1.
//
//Представим, что у нас есть устройство, в котором две колбы.
// Прибор работает корректно, если температура первой колбы выше 100 градусов,
//а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.

package main;
import java.util.Scanner;

class Tool {
    public static boolean toolWork(int temp1, int temp2) {
        return  temp1  > 100 && temp2 < 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first temperature");
        int temp1 = scanner.nextInt();
        System.out.println("Write second temperature");
        int temp2 = scanner.nextInt();
        boolean result = toolWork(temp1, temp2);
        if (result) {
            System.out.println("Its working");
        } else {
            System.out.println("Shit. Failed");
        }
        scanner.close();

    }
}
