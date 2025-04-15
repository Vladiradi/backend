package lesson;
import java.util.Scanner;
//Написать регулярное выражение для проверка email (например my_25@domen-38.de).

public classgit


//    import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class EmailValidator {
//    private static Pattern emailPattern = Pattern.compile("^[^@\\s]+@[^@\\s]+\\.de$");
//
//    public static boolean isValidEmail(String email) {
//        return emailPattern.matcher(email).matches();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Введите email для проверки (или 'exit' для выхода): ");
//            String email = scanner.nextLine();
//
//            if (email.equalsIgnoreCase("exit")) {
//                System.out.println("Выход из программы.");
//                break;
//            }
//
//            if (isValidEmail(email)) {
//                System.out.println("✅ Email корректный (.de и @ есть)");
//            } else {
//                System.out.println("❌ Email некорректный (нужны @ и .de)");
//            }
//        }
//
//        scanner.close();
//    }
//}




public class EmailCheck {

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.endsWith(".de");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите email (или 'exit' для выхода): ");
            String email = scanner.nextLine();

            if (email.equalsIgnoreCase("exit")) {
                System.out.println("Выход.");
                break;
            }

            if (isValidEmail(email)) {
                System.out.println("✅ Email корректный (@ и .de найдены)");
            } else {
                System.out.println("❌ Email некорректный (нужны @ и .de)");
            }
        }

        scanner.close();
    }
}