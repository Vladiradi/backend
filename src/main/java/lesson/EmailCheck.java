package lesson;
//Написать регулярное выражение для проверка email (например my_25@domen-38.de).
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailCheck {

        private static Pattern emailPattern = Pattern.compile("^[^@\\s]+@[^@\\s]+\\.de$");

        public static boolean isValidEmail(String email) {
            return emailPattern.matcher(email).matches();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите email для проверки: ");
            String email = scanner.nextLine();

            if (isValidEmail(email)) {
                System.out.println("✅ Email is correct");
            } else {
                System.out.println("❌ Email not correct (you need @ and .de)");
            }

            scanner.close();
        }
    }
