import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap mapGenreCount() {
        HashMap<String, Integer> genreCount = new HashMap<>();
        int fantasyCounter = 0;
        int dystFicCounter = 0;
        int youngAdultCounter = 0;
        for (int i = 0; i < collection.size(); i++) {
            Book book = collection.get(i);
            if (book.getGenre().equals("Fantasy")) {
                fantasyCounter++;
            } else if (book.getGenre().equals("Dystopian Fiction")) {
                dystFicCounter++;
            } else if (book.getGenre().equals("Young Adult")) {
                youngAdultCounter++;
            }
        }
        genreCount.put("Fantasy", fantasyCounter);
        genreCount.put("Dystopian Fiction", dystFicCounter);
        genreCount.put("Young Adult", youngAdultCounter);
        return genreCount;
    }
}



//            Book book = collection.get(i);
//            genreCount.put(book.getGenre(), ));
//        }
//        return genreCount;
//    }
//}
