package library.app.model;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private int availableCopies;

    public Book(String title, String author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public String getIsbn() { return isbn; }

    public int getAvailableCopies() { return availableCopies; }

    public void increaseCopies() { availableCopies++; }

    public void decreaseCopies() {
        if (availableCopies <= 0) throw new IllegalStateException("No copies available");
        availableCopies--;
    }
}