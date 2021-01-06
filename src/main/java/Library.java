import java.util.ArrayList;

public class Library {

    private int capacity = 3;
    private ArrayList<Book> collection;

    public Library() {
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() <= this.capacity) {
            this.collection.add(book);
        }
    }

    public void removeBook(Book book) {
        this.collection.remove(book);
    }
}