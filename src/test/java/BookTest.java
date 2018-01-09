import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("The Gunslinger");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Gunslinger", book.getTitle());
    }
}
