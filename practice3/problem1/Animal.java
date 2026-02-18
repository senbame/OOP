package practice3.problem1;

public abstract class Animal {
    private String name;
    private double age;
    private String gender;

    public Animal(){
        this.name = "No name";
        this.age = 0;
        this.gender = "No Gender";
    }
    public Animal(String name , double age , String gender){
        if(age < 0){
            throw new IllegalArgumentException("How the age is negative? :)");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getAge(){
        return age;
    }
    public void setAge(double age){
        this.age = age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void takeMeal(String food_type , double amount){
        System.out.println(name + " is eating " + amount + " of " + food_type);
    }
    public void goSleep(){
        System.out.println(name + " is going to sleep!");
    }
    public abstract void makeSound();
}
