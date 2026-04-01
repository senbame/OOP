package practice4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Restaurant r = new Restaurant(10);

        Cat cat = new Cat("Barsik", 3);
        Student s1 = new Student("Dastan", 20, 15, 3.5);
        Student s2 = new Student("Aruzhan", 19, 5, 3.9);
        Student s3 = new Student("Bekzat", 21, 20, 2.8);

        // Демонстрация
        r.servePizza(cat);
        r.servePizza(s1);
        r.servePizza(s2);

        // Сортировка
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("\n--- GPA sort ---");
        Collections.sort(list, new GPAComparator());
        list.forEach(System.out::println);

        System.out.println("\n--- Name sort ---");
        Collections.sort(list, new NameComparator());
        list.forEach(System.out::println);
    }
}