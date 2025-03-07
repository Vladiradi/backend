//№2.
//У вас на банковском счету N долларов.
//        Вы хотите снять все, но банк разрешает снять только сумму,
//        которая является делителем текущей суммы на счету и меньше текущей суммы.
//Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится,
//        чтобы забрать все свои деньги из банка?
//Примечание: если оставшаяся сумма равна 1, вы можете снять ее.


package main;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int n = scanner.nextInt();
        int days = countDays(n);
        System.out.println("You need days " + days);
        scanner.close();
    }
    public static int countDays(int n) {
        int days = 0;

        while (n > 0) {
            int maxDevisor = maxFind(n);
            n -= maxDevisor;
            days++;
        }
        return days;
    }
    public static int maxFind (int num) {
        for (int i = num - 1; i > 0; i--) {
            if (num % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

