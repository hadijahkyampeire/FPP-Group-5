package Prob3;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("SAN", "The little princess", "Haddy");
        library.addBook("IBM", "The little prince", "Omega");
        library.addBook("MHC", "The wonder woman", "Marie");

        System.out.println(library.books);

        library.borrowBook("IBM"); // should allow to borrow
        library.borrowBook("ADC"); // Doesn't exist
        library.borrowBook("IBM"); // Is already borrowed, Cant be borrowed
        library.returnBook("IBM"); // this is returned and should have borrowed as false
        library.borrowBook("MHC");
        System.out.println(library.isBookBorrowed("IBM")); // false
        System.out.println(library.isBookBorrowed("MHC")); // true
        library.isBookBorrowed("qwerty"); // Book doesn't exist, so cant be borrowed

        // Get book details
        library.getBookDetails("SAN");

        // list all books
        library.listAllBooks();

        // list borrowed books
        library.listBorrowedBooks();
    }
}
