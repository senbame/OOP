package lab3.Question6;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("Rex", 5);
        Animal cat = new Animal("Milo", 3);

        Person p1 = new Person("Alice", 25, dog);
        Person p2 = new Person("Bob", 20, cat);

        p1.feedPet();
        p2.trainPet();

        System.out.println(dog.compareTo(cat)); 
    }
}