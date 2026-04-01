package practice4;

public class Student extends Person
        implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable {

    private double gpa;

    public Student(String name, int age, double balance, double gpa) {
        super(name, age, balance);
        this.gpa = gpa;
    }
    @Override
    public void introduce() {
        System.out.println("I am " + getName() + ", GPA: " + gpa);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Hello!");
    }
    
    @Override
    public void eatPizza() {
        System.out.println(getName() + " eats pizza ");
    }

    @Override
    public void retakeExam(String subject) {
        System.out.println(getName() + " retakes " + subject );
    }

    @Override
    public void dance() {
        System.out.println(getName() + " dances ");
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves ");
    }
    
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "[name=" + getName() + ", age=" + getAge() + ", gpa=" + getGpa() + "]";
    }
}