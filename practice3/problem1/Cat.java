package practice3.problem1;

public class Cat extends Animal{
    private double size;
    public Cat(){
        super();
        this.size = 0.0;
    }

    public Cat(String name , double age , double size , String gender){
        super();
        this.size = size;
    }

    public double getSize(){
        return size;
    }
    public void setSize(double size){
        this.size = size;
    }
    
    @Override
    public void makeSound(){
        System.out.println("Meow-Meow");
    }
    public String toString(){
        return "Name:" + getName() + "\n" + 
                "Age:" + getAge() + "\n" +
                "Gender:" + getGender() + "\n" +
                "Size:" + getSize() + "\n";
    }
}
