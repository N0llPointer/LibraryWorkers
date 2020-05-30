package interfaces;


import other.Book;

public interface Supplier {
    void receiveBookOrder(String title);

    Book supplyOrderedBook();
}
