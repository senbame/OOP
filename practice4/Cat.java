package practice4;

public class Cat extends Animal implements CanHavePizza, Movable {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Meow 🐱");
    }

    @Override
    public void eatPizza() {
        System.out.println(getName() + " eats pizza 🍕");
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves 🐾");
    }
}