package lab2.Problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber){
        balance = 0.0;
        this.accNumber = accNumber;
    }
    public void deposit(double sum){
        if(sum > 0) balance += sum;
    }
    public void withdraw(double sum){
        if(sum > 0 && sum <= balance) balance -= sum;
        else System.out.println("Not enough money on balance or insufficient funds");
    }
    public double getBalance() {
        return balance;
    }
    public int getAccNumber() {
        return accNumber;
    }
    public void transfer(double amount , Account other){
        withdraw(amount);
        other.deposit(amount);
    }
    @Override
    public String toString() {
        return "Account #" + accNumber + " | Balance: $" + String.format("%.2f", balance);
    }

    public final void print() {
        System.out.println(toString());
    }

}
