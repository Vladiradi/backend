package lesson;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {

    private Map<String, Book> storage = new HashMap<>();

    public void add(Book book) {
        storage.put(book.getIsbn(), book);
    }

    public Book get(String isbn) {
        return storage.get(isbn);
    }
}