package practice3.problem1;

public class Dog extends Animal {
    private String breed;

    public Dog(){
        super();
        this.breed = "Doberman";
    }

    public Dog(String name , double age , String breed , String gender){
        super(name , age , gender);
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Woof-Woof");
    }
    public String toString(){
        return "Name:" + getName() + "\n" + 
                "Age:" + getAge() + "\n" +
                "Gender:" + getGender() + "\n" +
                "Breed:" + getBreed() + "\n";
    }
}
