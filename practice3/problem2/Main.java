package practice3.problem2;

import java.util.Scanner;
import java.util.Vector;

public class Main{

    public static void main(String[] args) {

        Vector<Person> people = new Vector<>();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Person");
            System.out.println("2. Add Student");
            System.out.println("3. Add Staff");
            System.out.println("4. Print All");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    people.add(new Person(name, address));
                    System.out.println("Person added.");
                    break;

                case 2:
                    System.out.print("Name: ");
                    name = sc.nextLine();

                    System.out.print("Address: ");
                    address = sc.nextLine();

                    System.out.print("Program: ");
                    String program = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();

                    System.out.print("Fee: ");
                    double fee = sc.nextDouble();
                    sc.nextLine();

                    people.add(new Student(name, address, program, year, fee));
                    System.out.println("Student added.");
                    break;

                case 3:
                    System.out.print("Name: ");
                    name = sc.nextLine();

                    System.out.print("Address: ");
                    address = sc.nextLine();

                    System.out.print("School: ");
                    String school = sc.nextLine();

                    System.out.print("Pay: ");
                    double pay = sc.nextDouble();
                    sc.nextLine();

                    people.add(new Staff(name, address, school, pay));
                    System.out.println("Staff added.");
                    break;

                case 4:
                    if (people.isEmpty()) {
                        System.out.println("No records.");
                    } else {
                        for (Person p : people) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
