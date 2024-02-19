import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String publicationDate;

    // Constructor
    public Book(String title, String author, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    // Method to add book to collection
    public static void addBook(ArrayList<Book> collection, Book book) {
        collection.add(book);
        System.out.println("Book added to collection: " + book.getTitle());
    }

    // Method to remove book from collection
    public static void removeBook(ArrayList<Book> collection, Book book) {
        if (collection.remove(book)) {
            System.out.println("Book removed from collection: " + book.getTitle());
        } else {
            System.out.println("Book not found in collection: " + book.getTitle());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ArrayList<Book> collection = new ArrayList<>();

        // Adding books to collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "April 10, 1925");
        addBook(collection, book1);

        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "July 11, 1960");
        addBook(collection, book2);

        // Removing a book from collection
        removeBook(collection, book1);
    }
}
