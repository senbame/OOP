
package midterm_preparation.first;

import java.util.Objects;
public class Book extends Item {
    String author;
    Genre genre;
    public Book(String title, int year, String author, Genre genre){
        super(title, year);
        this.author = author;
        this.genre = genre;
    }
    @Override
    public String toString(){
        return super.toString() + ", Author: " + author + ", Genre: " + genre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) && genre == book.genre;
    }
    @Override
    public int hashCode() {
       return Objects.hash(title, year, author, genre);
    }
}
