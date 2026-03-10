package midterm_preparation.first;



public abstract class Item {
    String title;
    int year;

    static {
        System.out.println("Static block in Item class executed.");
    }
    {
        System.out.println("Instance block in Item class executed.");
    }
    public Item(String title , int year){
        this.title = title;
        this.year = year;
    }
    public String toString(){
        return "Title: " + title + ", Year: " + year;
    }
}
