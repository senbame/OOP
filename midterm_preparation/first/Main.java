package midterm_preparation.first;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald", Genre.FICTION);
        Magazine mag1 = new Magazine("National Geographic", 2024, 5);
        Book book2 = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald", Genre.FICTION);

        System.out.println("Book Title: " + book1.title + ", Author: " + book1.author + ", Year: " + book1.year);
        System.out.println("Magazine Title: " + mag1.title + ", Issue Number: " + mag1.issueNumber + ", Year: " + mag1.year);
        System.out.println("Book 2 Title: " + book2.title + ", Author: " + book2.author + ", Year: " + book2.year);

        Item[] library = new Item[2];
        library[0] = book1;
        library[1] = mag1;
        for (Item item : library){
            System.out.println(item.toString());
        }
        System.out.println(book1.hashCode());
        
    }
}
