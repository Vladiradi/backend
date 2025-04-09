package lesson;
import java.util.HashSet;
import java.util.Set;

public class SetExampleCustom {

        public static void main(String[] args) {
            Book one = new Book("One");
            Book two = new Book("One");

            Set<Book> books = new HashSet<>();
            books.add(one);
            books.add(two);

            System.out.println("Books set size: " + books.size());
            System.out.println("Books: " + books);
        }

}


