public class Runner {

    public static void main(String[] args) {

        Library library = new Library("Central Library", 7);
        Book book1 = new Book("The Fellowship Of The Ring", "Fantasy");
        Book book2 = new Book("The Knife Of Never Letting Go", "Dystopian Fiction");
        Book book3 = new Book("Northern Lights", "Young Adult");
        Book book4 = new Book("The Two Towers", "Fantasy");
        Book book5 = new Book("The Ask and The Answer", "Dystopian Fiction");
        Book book6 = new Book("The Subtle Knife", "Young Adult");
        Book book7 = new Book("The Amber Spyglass", "Young Adult");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        System.out.println(library.mapGenreCount());
    }
}
