import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library();
        book = new Book("1984", "George Orwell", "Sci-Fi");
        book2 = new Book("Lord of the Flies", "William Golding", "Allegorical");
        book3 = new Book("Jack Reacher: Killing Floor", "Lee Child", "Action");
        book4 = new Book("A Farewell to Arms", "Ernest Hemingway", "War");
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToCollection(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void removeBookFromCollection(){
        library.addBook(book);
        library.addBook(book4);
        library.removeBook(book);
        assertEquals(1, library.bookCount());
    }
}