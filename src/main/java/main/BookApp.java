package main;

public class BookApp {
    public static void main(String[] args) {
        Book bookOne = new Book("Book", "12345", 150, new Author("Author", 50, new City("Berlin")));
        Book bookTwo = new Book("Book", "12345", 150, new Author("Author", 50, new City("Berlin")));

        System.out.println("bookOne is equal  bookTwo : " + bookOne.equals(bookTwo));
    }
}