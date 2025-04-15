package lesson;
import java.util.Scanner;
//Написать регулярное выражение для проверка email (например my_25@domen-38.de).

public class EmailCheck {
    public static boolean checkEmail(String email) {
        return email.contains("@") && email.contains(".de");
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         while (true) {
             System.out.println("Please enter a valid email address or exit:");
             String email = scanner.nextLine();

             if (email.equalsIgnoreCase("exit")) {
                 System.out.println("Bye");
                 break;
             }

             if (checkEmail(email)) {
                 System.out.println("Your email is valid ✅ ");
             } else {
                 System.out.println("Your email is not valid ❌ (you need @ and .de)");
             }
         }
        scanner.close();
    }
}
