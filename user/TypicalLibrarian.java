package user;

import interfaces.Librarian;
import interfaces.Reader;
import interfaces.Supplier;
import other.Book;

public class TypicalLibrarian implements Reader, Librarian {

    private Book borrowedBook;

    public TypicalLibrarian() {
        this.borrowedBook = null;
    }

    @Override
    public void orderBook(String title, Supplier supplier) {
        supplier.receiveBookOrder(title);
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
    public String toString() {
        return "Arya";
    }
}
