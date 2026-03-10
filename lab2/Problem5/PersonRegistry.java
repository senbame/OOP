package lab2.Problem5;
import java.util.HashSet;

public class PersonRegistry {
    private HashSet<Person> people;

    public PersonRegistry(){
        people = new HashSet<>();
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public void removePerson(Person person){
        people.remove(person);
    }

    public HashSet<Person> getPeopleWithPets(){
        HashSet<Person> PeopleWithPets = new HashSet<>();
        for(Person p : people){
            if(p.hasPet()) PeopleWithPets.add(p);
        }
        return PeopleWithPets;
    }
    public HashSet<Person> getPeopleWithoutPets(){
        HashSet<Person> PeopleWithoutPets = new HashSet<>();
        for(Person p : people){
            if(!p.hasPet()) PeopleWithoutPets.add(p);
        }
        return PeopleWithoutPets;
    }
   @Override
    public String toString() {
        String result = "Person Registry:\n";

        for (Person p : people) {
            result += p + "\n";
        }

        return result;
    }
}
