package lab2.Problem1.PartB;

public abstract class LibraryItem {
    private String author;
    private String title;
    private int publicationYear;

    public LibraryItem(){
        this.author = "Unknown";
        this.title = "Unknown";
        this.publicationYear = 0;
    }
    public LibraryItem(String author , String title , int publicationYear){
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Author: " + getAuthor() + ", Title: " + getTitle() + ", Publication Year:" + getPublicationYear();
    }
}
