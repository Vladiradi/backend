package telran;
import java.util.Scanner;

public class Validator {
    public static void main(String[] args) {
        Validator validator = new Validator();
        validator.validate();
    }

    public void validate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter login");
        String login = scanner.nextLine();

        System.out.println("enter password");
        String password = scanner.nextLine();

        System.out.println("confirm password");
        String confirm = scanner.nextLine();

        try {
            checkCredentials(login, password, confirm);
            System.out.println("valid");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("invalid" + e.getMessage());
        }
        scanner.close();
    }

    public void checkCredentials(String login, String password, String confirm) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() >= 20 || !login.matches("^[A-Za-z][A-Za-z0-9_]*$")) {
            throw new WrongLoginException("Login must be < 20 chars, start with letter, contain only letters");
        }

        if (password == null || password.length() >= 20 || !password.matches("^[A-Za-z0-9]+$")) {
            throw new WrongPasswordException("Password must be < 20 chars and contain only letters and digits.");
        }

        if (!password.equals(confirm)) {
            throw new WrongPasswordException("Passwords do not match.");
        }
    }

    public static class WrongLoginException extends Exception {
        public WrongLoginException() {
            super();
        }

        public WrongLoginException(String message) {
            super(message);
        }
    }
    public static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
            super();
        }

        public WrongPasswordException(String message) {
            super(message);
        }
    }
}
