package main;

public class Book {
    private String title;
    private String isbn;
    private int pages;
    private Author author;
    public Book(String title, String isbn, int pages, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.pages = pages;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getPages() {
        return pages;
    }
    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;

        if (pages != other.pages) return false;

        if (title == null) {
            if (other.title != null) return false;
        } else if (!title.equals(other.title)) return false;

        if (isbn == null) {
            if (other.isbn != null) return false;
        } else if (!isbn.equals(other.isbn)) return false;

        if (author == null) {
            return other.author == null;
        } else {
            return author.equals(other.author);
        }
    }
}