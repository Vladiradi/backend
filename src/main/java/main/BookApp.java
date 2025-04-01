package main;

import java.util.*;
import java.util.stream.Collectors;

public class BookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", 310, "Tolkien", 1937));
        books.add(new Book("Harry Potter", 450, "Rowling", 1997));
        books.add(new Book("Game of Thrones", 694, "Martin", 1996));
        books.add(new Book("The Silmarillion", 365, "Tolkien", 1977));
        books.add(new Book("Fantastic Beasts", 200, "Rowling", 2001));
        books.add(new Book("Clash of Kings", 768, "Martin", 1998));
        books.add(new Book("Children of Húrin", 313, "Tolkien", 2007));
        books.add(new Book("Half-Blood Prince", 652, "Rowling", 2005));
        books.add(new Book("Storm of Swords", 973, "Martin", 2000));
        books.add(new Book("Deathly Hallows", 759, "Rowling", 2007));


        System.out.println("Choose sorting method:");
        System.out.println("1. Sort by year");
        System.out.println("2. Sort by number of pages");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                books.sort(Comparator.comparingInt(Book::getYear));
                System.out.println("\nBooks sorted by year:");
                break;
            case 2:
                books.sort(Comparator.comparingInt(Book::getPages));
                System.out.println("\nBooks sorted by number of pages:");
                break;
            default:
                System.out.println("Invalid choice. Showing unsorted list.");
                break;
        }


        for (Book book : books) {
            System.out.println(book);
        }


        System.out.println("\nEnter author name to filter books:");
        scanner.nextLine();  // Чтобы очистить буфер после nextInt()
        String authorName = scanner.nextLine();

        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(authorName))
                .collect(Collectors.toList());

        if (filteredBooks.isEmpty()) {
            System.out.println("No books found by " + authorName);
        } else {
            System.out.println("\nBooks by " + authorName + ":");
            for (Book book : filteredBooks) {
                System.out.println(book);
            }
        }
    }
}