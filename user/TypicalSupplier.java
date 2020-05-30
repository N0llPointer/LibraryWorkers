package user;

import interfaces.Reader;
import interfaces.Supplier;
import other.Book;

public class TypicalSupplier implements Reader, Supplier {

    private Book borrowedBook;

    private Book orderedBook;

    public TypicalSupplier() {
        this.borrowedBook = null;
        this.orderedBook = null;
    }

    @Override
    public void borrowBook(Book book) {
        borrowedBook = book;
    }

    @Override
    public Book returnBook() {
        return borrowedBook;
    }

    @Override
    public void receiveBookOrder(String title) {
        orderedBook = new Book(title);
    }

    @Override
    public Book supplyOrderedBook() {
        return orderedBook;
    }

    @Override
    public String toString() {
        return "user.TypicalSupplier";
    }
}
