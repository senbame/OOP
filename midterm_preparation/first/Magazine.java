package midterm_preparation.first;

public class Magazine extends Item {
    int issueNumber;

    public Magazine(String title , int year , int issueNumber){
        super(title, year);
        this.issueNumber = issueNumber;
    }
    @Override
     public String toString(){
        return super.toString() + ", Issue Number: " + issueNumber;
    }
}
