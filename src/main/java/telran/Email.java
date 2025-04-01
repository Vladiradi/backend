package telran;
public class Email {

    public static void validateEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Неверный формат e-mail. Требуется '@' и хотя бы одна '.'");
        }
    }

    public static void main(String[] args) {

        validateEmail("example@mail.com");

        validateEmail("examplemailcom");
}