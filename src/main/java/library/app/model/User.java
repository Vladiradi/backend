package library.app.model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final String name;
    private final String userId;
    private final Set<Book> borrowedBooks = new HashSet<>();

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() { return name; }

    public String getUserId() { return userId; }

    public Set<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}