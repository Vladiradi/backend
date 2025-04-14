package lesson;
import java.util.Scanner;


public class HMTask {

        public static void main(String[] args) {
            BookStorage bookStorage = new BookStorage();

            bookStorage.add(new Book("One", "12345"));
            bookStorage.add(new Book("Destrukt", "67890"));
            bookStorage.add(new Book("Restrukt", "54321"));

            Scanner scanner = new Scanner(System.in);
            System.out.print("put isbn number for searh: ");
            String isbn = scanner.nextLine();

            Book book = bookStorage.get(isbn);

            if (book != null) {
                System.out.println("Book found: " + book);
            } else {
                System.out.println("Book not found: " + isbn);
            }

            scanner.close();
        }

}
