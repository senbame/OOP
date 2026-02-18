package practice3.problem1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog by default:");
        Dog default_dog = new Dog();
        System.out.println(default_dog.toString());
        default_dog.takeMeal("Meat", 2);
        default_dog.goSleep();

        System.out.println();

        Dog my_Dog = new Dog("Nurik", 19, "Human", "Male");
        System.out.println("Dog's Name: " + my_Dog.getName());
        System.out.println("Dog's Breed: " + my_Dog.getBreed());
        my_Dog.makeSound();

        System.out.println();

        Cat my_Cat = new Cat("Murka" ,4 , 12 , "Female");
        System.out.println("Cat's Name: " + my_Cat.getName());
        System.out.println("Cat's Size: " + my_Cat.getSize());
        my_Cat.makeSound();

    }
}
