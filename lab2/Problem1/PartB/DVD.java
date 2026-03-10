package lab2.Problem1.PartB;

public class DVD extends LibraryItem{
    private String genre;
    private int duration;

    public DVD(String author , String title , int publicationYear){
        super(author, title, publicationYear);
        this.genre = "Unknown";
        this.duration = 0;
    }
    public DVD(String author , String title , int publicationYear , String genre , int duration){
        super(author , title, publicationYear);
        this.genre = genre;
        this.duration = duration;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString() + ", Genre: " + genre + ", Duration: " + duration + " minutes.";
    }
}     
