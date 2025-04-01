package main;

public class Book {
    private String title;
    private int pages;
    private String author;
    private int year;

    public Book(String title, int pages, String author, int year) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }
}