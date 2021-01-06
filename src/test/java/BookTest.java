import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("1984", "George Orwell", "Sci-Fi");
    }

    @Test
    public void bookTitle(){
        assertEquals("1984", book.getTitle());
    }

    @Test
    public void bookAuthor(){
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void bookGenre(){
        assertEquals("Sci-Fi", book.getGenre());
    }
}