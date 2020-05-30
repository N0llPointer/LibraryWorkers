import other.Book;
import user.TypicalAdministrator;
import user.TypicalLibrarian;
import user.TypicalReader;
import user.TypicalSupplier;

public class Main {

    public static void main(String[] args) {

        TypicalAdministrator administrator = new TypicalAdministrator();
        TypicalLibrarian librarian = new TypicalLibrarian();
        TypicalReader reader = new TypicalReader();
        TypicalSupplier supplier = new TypicalSupplier();


        librarian.orderBook("War and Peace", supplier);
        Book orderedBook = supplier.supplyOrderedBook();
        System.out.println(orderedBook);

        Book newBook = administrator.giveOutBook("Lord of the rings");
        System.out.println(newBook);
        reader.borrowBook(newBook);

        administrator.overdueNotification(reader);

        Book returnedBook = reader.returnBook();
        System.out.println(returnedBook);
    }
}
