package lab3.Question4;

import java.util.*;

public class Employee extends Person
        implements Comparable<Employee>, Cloneable {

    protected double salary;
    protected Date   hireDate;
    protected String nationalInsuranceNumber;

    // Constructors
    public Employee(String name, double salary, Date hireDate, String ni) {
        super(name);
        this.salary   = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = ni;
    }
    public Employee(String name, double salary) {
        this(name, salary, new Date(), "N/A");
    }

    // Accessors
    public double getSalary()   { return salary; }
    public Date   getHireDate() { return new Date(hireDate.getTime()); } 
    public String getNI()       { return nationalInsuranceNumber; }
    public void   setSalary(double s) { this.salary = s; }

    // Comparable 
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return String.format("Employee{name='%s', salary=%.2f, hired=%s, NI=%s}",
                name, salary, hireDate, nationalInsuranceNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return Double.compare(salary, e.salary) == 0
            && nationalInsuranceNumber.equals(e.nationalInsuranceNumber);
    }

    @Override public int hashCode() {
        return Objects.hash(name, salary, nationalInsuranceNumber);
    }

    // Clone 
    @Override
    public Employee clone() {
        try {
            Employee copy = (Employee) super.clone();
            copy.hireDate = new Date(hireDate.getTime());
            return copy;
        } catch (CloneNotSupportedException e) { throw new AssertionError(); }
    }

    // Comparators
    public static final Comparator<Employee> BY_NAME =
            Comparator.comparing(e -> e.name);

    public static final Comparator<Employee> BY_HIRE_DATE =
            Comparator.comparing(Employee::getHireDate);
}
