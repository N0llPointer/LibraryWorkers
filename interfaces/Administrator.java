package interfaces;

import other.Book;

public interface Administrator {
    Book giveOutBook(String title);

    void overdueNotification(Reader reader);
}
