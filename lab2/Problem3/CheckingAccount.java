package lab2.Problem3;

public class CheckingAccount extends Account{
    private int transactionsCounter;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE_PER_TRANSACTION = 0.02;

    public CheckingAccount(int accNumber){
        super(accNumber);
        transactionsCounter = 0;
    }

    @Override
    public void deposit(double sum){
        super.deposit(sum);
        transactionsCounter++;
    }
    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        transactionsCounter++;
    }

    public void deductFee(){
        if (transactionsCounter > FREE_TRANSACTIONS){
            int extraTransactions = transactionsCounter - FREE_TRANSACTIONS;
            double fee = extraTransactions * FEE_PER_TRANSACTION;
            super.withdraw(fee);
            System.out.println("Fee is taken your balance: $" + fee + " Your balance now is: " + super.getBalance());
        }

    }
    public int getTransactionsCounter() {
        return transactionsCounter;
    }
    @Override
    public String toString(){
        return "Checking:" + super.toString() + " <---> Transactions: " + transactionsCounter;
    }
}
