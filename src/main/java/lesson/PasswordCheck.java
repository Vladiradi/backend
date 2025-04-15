//Написать регулярное выражение для проверки корректности нового пароля,
//который соответствует определенным критериям:
//состоять минимум из 8 символов;
//должен обязательно включать хотя бы одну маленькую букву;
//должен обязательно включать хотя бы одну большую букву;
//должен обязательно включать хотя бы одну цифру;
//должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&_+-=);

package lesson;
import java.util.Scanner;

public class PasswordCheck {

    static String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&_+\\-=])[A-Za-z\\d!@#$%^&_+\\-=]{8,}$";

    public static boolean isValidPassword(String password) {
        return password.matches(passwordRegex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a password (or type exit): ");
            String password = scanner.nextLine();

            if (password.equalsIgnoreCase("exit")) {
                System.out.println("Bye");
                break;
            }

            if (isValidPassword(password)) {
                System.out.println(" Password is valid! ✅ ");
            } else {
                System.out.println("Password is invalid ❌ check requirements");
            }
        }

        scanner.close();
    }
}
