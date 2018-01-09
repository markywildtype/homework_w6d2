import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
       return this.collection.size();
    }

    public void addBook(Book book) {
        if(this.capacity > 0) {
            this.collection.add(book);
            this.capacity--;
        }
    }

    public Book removeBook(Book book) {
        this.collection.remove(book);
        this.capacity++;
        return book;
    }

    public int checkCapacity() {
        return this.capacity;
    }
}
