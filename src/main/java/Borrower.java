import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;
    
    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void borrowBook(Library library, Book book) {
        Book lent = library.removeBook(book);
        addBook(lent);

    }
}
