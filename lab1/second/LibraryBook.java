package lab1.second;

public class LibraryBook {
    public enum Genre {
        FICTION, NONFICTION, SCIENCE, HISTORY, FANTASY, MYSTERY
    }


    public static final String LIBRARY_NAME = "Central University Library";

   
    private static int totalBooks = 0;

  
    private final int bookId;


    private final String isbn;

    private String title;
    private String author;
    private Genre genre;


    {
     
        totalBooks++;
       
    }

    
    public LibraryBook() {
        this.bookId = totalBooks;      
        this.isbn = "UNKNOWN";
        this.title = "Untitled";
        this.author = "Unknown";
        this.genre = Genre.NONFICTION;
    }

   
    public LibraryBook(String isbn, String title, String author, Genre genre) {
        this.bookId = totalBooks;        
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

  
    public void setLocation(String shelf) {
        
        System.out.printf("Placing book '%s' on shelf %s%n", title, shelf);
    }

    public void setLocation(String shelf, int position) {
        System.out.printf("Placing book '%s' on shelf %s at position %d%n", title, shelf, position);
    }

    public String getIsbn() {
        return isbn;
    }

    public int getBookId() {
        return bookId;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public String toString() {
        return String.format("LibraryBook{id=%d, title=%s, author=%s, isbn=%s, genre=%s}",
                bookId, title, author, isbn, genre);
    }
}
