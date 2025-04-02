//1  Создайте метод, в который передается строка e-mail и он проверяет его на правильность
//по условию:
//строка должна содержать @
//
//строка должно содержать хотя бы один символ "точка"
//Если условия не соблюдаются - метод выбрасывает встроенное исключение IllegalArgumentException.

package telran;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mail;

        while (true) {
            System.out.println("Please enter email address: ");
            mail = scanner.nextLine();

            try {
                validateEmail(mail);
                break;          //  uncomment  if  want eternity asking 
            } catch (Exception e) {
                System.out.println("Not valid. Try again " + e.getMessage());
            }
        }
            scanner.close();  //   uncomment  if want eternity asking
    }

    public static void validateEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email");
        } else
            System.out.println("Valid email");
    }
}


