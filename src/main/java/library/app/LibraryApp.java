package library.app;
import library.app.model.Book;
import library.app.model.User;
import library.app.repository.Library;
import library.app.service.LibraryManager;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryManager manager = new LibraryManager(library);

        Book book = new Book("Code", "Robert C. Martin", "9780132350884", 3);
        User user = new User("Alice", "u1");

        manager.addBook(book);
        manager.registerUser(user);

        manager.borrowBook("9780132350884", user);
        System.out.println("Borrowed books: " + user.getBorrowedBooks());
    }
}