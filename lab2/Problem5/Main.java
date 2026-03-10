package lab2.Problem5;

public class Main {
    public static void main(String[] args) {

        // Создаём людей
        Person michael  = new Employee("Michael", 35, "Architect");
        Person emily    = new PhDStudent("Emily", 28, "Physics", "Quantum Mechanics");
        Person sarah    = new Student("Sarah", 21, "Chemistry");

        // Создаём животных
        Animal whiskers  = new Cat("Whiskers", 4);
        Animal buddy     = new Dog("Buddy", 2);
        Animal chirpy    = new Bird("Chirpy", 1);

        // Назначаем питомцев
        michael.assignPet(whiskers);
        sarah.assignPet(chirpy);

        // Попытка дать собаку PhD студенту 
        System.out.println("--- Trying to assign Dog to PhD student ---");
        emily.assignPet(buddy);

        // Создаём реестр
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(michael);
        registry.addPerson(emily);
        registry.addPerson(sarah);

        System.out.println("\n--- Initial state ---");
        System.out.println(registry);

        
        System.out.println("--- Michael leaves pet with Emily ---");
        michael.leavePetWith(emily);
        System.out.println(registry);

        System.out.println("--- Michael retrieves pet from Emily ---");
        michael.retrievePetFrom(emily);
        System.out.println(registry);

        System.out.println("People with pets:    " + registry.getPeopleWithPets().size());
        System.out.println("People without pets: " + registry.getPeopleWithoutPets().size());
    }
}