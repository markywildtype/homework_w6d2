import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Borrower borrower;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void before(){
        library = new Library("Fountainbridge Library", 5);
        borrower = new Borrower("Mark Blanford");
        book1 = new Book("The Fellowship Of The Ring");
        book2 = new Book("The Knife Of Never Letting Go");
        book3 = new Book("Northern Lights");
        book4 = new Book("The Two Towers");
        book5 = new Book("The Ask and The Answer");
        book6 = new Book("The Subtle Knife");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Mark Blanford", borrower.getName());
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddToCollection(){
        borrower.addBook(book1);
        borrower.addBook(book2);
        assertEquals(2, borrower.collectionCount());
    }

    @Test
    public void canBorrowFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.borrowBook(library, book2);
        assertEquals(1, borrower.collectionCount());
        assertEquals(2, library.bookCount());
    }
}
