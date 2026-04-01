package practice4;

public abstract class Person extends Animal {

    private double balance;

    public Person(String name, int age, double balance) {
        super(name, age);
        this.balance = balance;
    }

    public abstract void introduce();

    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(getName() + " paid $" + amount);
            return true;
        }
        System.out.println(getName() + " doesn't have $" + amount);
        return false;
    }

    public double getBalance() { return balance; }
}