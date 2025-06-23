package library.app.service;

import library.app.repository.Library;
import library.app.model.Book;
import library.app.model.User;

public class LibraryManager {
    private final Library library;

    public LibraryManager(Library library) {
        this.library = library;
    }

    public void borrowBook(String isbn, User user) {
        Book book = library.findBookByIsbn(isbn);
        if (book == null) throw new IllegalArgumentException("Book not found");
        if (book.getAvailableCopies() <= 0) throw new IllegalStateException("No copies available");

        book.decreaseCopies();
        user.borrowBook(book);
    }

    public void returnBook(String isbn, User user) {
        Book book = library.findBookByIsbn(isbn);
        if (book == null) throw new IllegalArgumentException("Book not found");

        book.increaseCopies();
        user.returnBook(book);
    }

    public void addBook(Book book) {
        library.addBook(book);
    }

    public void removeBook(Book book) {
        library.removeBook(book);
    }

    public void registerUser(User user) {
        library.registerUser(user);
    }
}