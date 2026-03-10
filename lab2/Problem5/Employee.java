package lab2.Problem5;

public class Employee extends Person{
    private String profession;
    public Employee(String name , int age , String profession){
        super(name, age);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String getOccupation() { return "Employee's job is " + profession;}
}
