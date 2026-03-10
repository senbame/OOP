package lab2.Problem3;

public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(int accNumber , double interestRate){
        super(accNumber);
        this.interestRate = interestRate;
    }
    
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        super.deposit(interest);
    }
    public double getInterestRate() { return interestRate; }

    @Override
    public String toString() {
        return "Savings" + super.toString() + " | Interest Rate: " + interestRate + "%";
    }
}
