package lab3.Question6;

public class Animal implements Feedable, Trainable, Runnable, Comparable<Animal> {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating");
    }

    @Override
    public void train() {
        System.out.println(name + " is being trained");
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public int compareTo(Animal other) {
        return this.age - other.age; // сравнение по возрасту
    }

    @Override
    public String toString() {
        return name + " (age: " + age + ")";
    }
}
