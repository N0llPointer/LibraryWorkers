package user;

import interfaces.Reader;
import other.Book;

public class TypicalReader implements Reader {

    private Book borrowedBook;

    public TypicalReader() {
        this.borrowedBook = null;
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
        return "user.TypicalReader";
    }
}
