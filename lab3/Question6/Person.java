package lab3.Question6;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age, Animal pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public void feedPet() {
        if (pet != null) {
            pet.feed();
        }
    }

    public void trainPet() {
        if (pet != null) {
            pet.train();
        }
    }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + " (age: " + age + "), pet: " + pet;
    }
}
