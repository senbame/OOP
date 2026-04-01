package lab3.Question4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020, Calendar.JANUARY, 15);
        Date d1 = cal1.getTime();  // 2020-01-15
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2018, Calendar.JUNE, 1);
        Date d2 = cal2.getTime();  // 2018-06-01

        Employee e1 = new Employee("Alice", 50000, d1, "AB123456C");
        Employee e2 = new Employee("Bob",   45000, d2, "CD987654E");
        Manager  m1 = new Manager("Carol",  80000, d2, "EF111222G", 15000);
        m1.addToTeam(e1);
        m1.addToTeam(e2);

        System.out.println(e1);
        System.out.println(m1);
        System.out.println("e1 > e2? "          + (e1.compareTo(e2) > 0));   // true
        System.out.println("e1.equals(clone)? "  + e1.equals(e1.clone()));   // true

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, m1));

        list.sort(Employee.BY_NAME);
        System.out.println("By name:      " + list);

        list.sort(Employee.BY_HIRE_DATE);
        System.out.println("By hire date: " + list);

        Collections.sort(list);   // natural order = by salary
        System.out.println("By salary:    " + list);
    }
}