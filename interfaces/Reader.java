package interfaces;


import other.Book;

public interface Reader {
    void borrowBook(Book book);

    Book returnBook();
}
