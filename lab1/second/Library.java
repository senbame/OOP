package lab1.second;

enum Status {
    AVAILABLE, BORROWED, RESERVED
}

public class Library {

    private static int totalBooks = 0;
    private static String libraryName = "Central Library";

    private final int bookId;
    private final String isbn;

    private String title;
    private String author;
    private Status status;

    {
        totalBooks++;
    }

    public Library(String isbn, String title, String author) {
        this.bookId = totalBooks;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.status = Status.AVAILABLE;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setStatus(String statusString) {
        this.status = Status.valueOf(statusString.toUpperCase());
    }

    public void printInfo() {
        System.out.printf("Book ID: %d, Title: %s, Author: %s, ISBN: %s, Status: %s%n",
                bookId, title, author, isbn, status);
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    public static void main(String[] args) {
        Library b1 = new Library("978-1234567890", "Java Programming", "Alice");
        Library b2 = new Library("978-0987654321", "Python Programming", "Bob");

        b1.printInfo();
        b2.printInfo();

        b1.setStatus(Status.BORROWED);
        b2.setStatus("reserved");

        System.out.println("\nAfter status change:");
        b1.printInfo();
        b2.printInfo();

        System.out.println("\nTotal books: " + Library.getTotalBooks());
        System.out.println("Library name: " + Library.getLibraryName());
    }
}
