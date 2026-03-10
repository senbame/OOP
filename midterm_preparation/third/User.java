package midterm_preparation.third;

public abstract class User {
    static int id = 0;
    String login;
    int date;


    {
        id++;
    }
    public User(String login , int date){
        this.login = login;
        this.date = date;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj ) return true;
        if(!(obj instanceof User)) return false;
        User user = (User) obj;
        return login.equals(user.login) && date == user.date;
       }

    @Override
    public String toString(){
        return "Login: " + login + ", Date: " + date + ", ID: " + id;
    }

    
}
