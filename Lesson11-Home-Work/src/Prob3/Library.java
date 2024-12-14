package Prob3;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Library {
    HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }
    public void addBook(String ISBN, String title, String author) {
        Set<String> allISBN = books.keySet();
        if (!allISBN.contains(ISBN)) {
            Book book = new Book(ISBN, title, author);
            books.put(ISBN, book);
        } else {
            System.out.printf("Book with this %s ISBN already exists%n", ISBN);
        }
    }

    public void borrowBook(String ISBN) {
        Set<String> allISBN = books.keySet();
        if (allISBN.contains(ISBN)) {
            Book book = books.get(ISBN);
            if (!book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.printf("Book with %s ISBN, has been borrowed \n", ISBN);

            } else {
                System.out.printf("Book with this %s is already borrowed \n", ISBN);
            }
        } else {
            System.out.printf("Book with this %s ISBN doesn't exist%n", ISBN);
        }
    }

    public void returnBook(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            if (book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.printf("Book with %s ISBN, has been returned \n", ISBN);
            }
        } else {
            System.out.printf("Book with this %s ISBN doesn't exist%n \n", ISBN);
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        if (!books.containsKey(ISBN)) {
            System.out.printf("Book with this %s ISBN doesn't exist \n", ISBN);
            return false;
        }
        return books.get(ISBN).isBorrowed();
    }

    public void getBookDetails(String ISBN) {
        books.get(ISBN);
    }

    public void listAllBooks() {
        System.out.println("\nLibrary Books");
        for (Book book : books.values()) {
            System.out.println(book.toString());
        }
    }

    public void listBorrowedBooks() {
        System.out.println("\nList of borrowed Books: ");
        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }
}
