package user;

import interfaces.Administrator;
import interfaces.Librarian;
import interfaces.Reader;
import interfaces.Supplier;
import other.Book;

public class TypicalAdministrator implements Librarian, Administrator, Reader {

    private Book borrowedBook;

    public TypicalAdministrator() {
        this.borrowedBook = null;
    }

    @Override
    public Book giveOutBook(String title) {
        return new Book(title);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(reader + ", пожалуйста, верните взятую книгу!");
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
        return "user.TypicalAdministrator";
    }
}
