//Реализуйте программу, которая попросит пользователя ввести год и
//        напечатать этот год isLeap (високосный) или нет.
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
        scanner.close();
    }
}