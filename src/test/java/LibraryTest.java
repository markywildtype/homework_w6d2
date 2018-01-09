import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Book book6;

    @Before
    public void before(){
        library = new Library("Central Library", 5);
        book1 = new Book("The Fellowship Of The Ring", "Fantasy");
        book2 = new Book("The Knife Of Never Letting Go", "Dystopian Fiction");
        book3 = new Book("Northern Lights", "Young Adult");
        book4 = new Book("The Two Towers", "Fantasy");
        book5 = new Book("The Ask and The Answer", "Dystopian Fiction");
        book6 = new Book("The Subtle Knife", "Young Adult");
    }

    @Test
    public void collectionIsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddToCollection(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveFromCollection(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(5, library.checkCapacity());
    }

    @Test
    public void cannotAddIfAtCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.bookCount());
        assertEquals(0, library.checkCapacity());
    }
}
