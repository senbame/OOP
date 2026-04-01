package lab3.Question4;

import java.util.*;

public class Manager extends Employee {
    private double           bonus;
    private Vector<Employee> team;

    public Manager(String name, double salary, Date hireDate, String ni, double bonus) {
        super(name, salary, hireDate, ni);
        this.bonus = bonus;
        this.team  = new Vector<>();
    }

    public double          getBonus()           { return bonus; }
    public void            setBonus(double b)   { this.bonus = b; }
    public Vector<Employee> getTeam()           { return team; }
    public void            addToTeam(Employee e){ team.add(e); }
    public double          totalPackage()       { return salary + bonus; }

    // salary first; if equal, compare by bonus
    @Override
    public int compareTo(Employee other) {
        int cmp = Double.compare(this.salary, other.getSalary());
        if (cmp != 0) return cmp;
        if (other instanceof Manager)
            return Double.compare(bonus, ((Manager) other).bonus);
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Manager{name='%s', salary=%.2f, bonus=%.2f, team=%s}",
                name, salary, bonus, team);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Manager)) return false;
        return Double.compare(bonus, ((Manager) o).bonus) == 0;
    }

    // Deep clone
    @Override
    public Manager clone() {
        Manager copy = (Manager) super.clone();
        copy.team = new Vector<>();
        for (Employee e : team) copy.team.add(e.clone());
        return copy;
    }
}