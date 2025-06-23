package library.app.repository;
import library.app.model.Book;
import library.app.model.User;
import java.util.Map;
import java.util.HashMap;


public class Library {
    private final Map<String, Book> books = new HashMap<>();
    private final Map<String, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(Book book) {
        books.remove(book.getIsbn());
    }

    public Book findBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

    public User findUserById(String userId) {
        return users.get(userId);
    }
}