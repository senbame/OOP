package lab2.Problem3;
import java.util.Vector;
public class Bank {
    private Vector<Account> accounts;

    public Bank(){
        accounts = new Vector<>();
    }
    public void openAccount(Account account){
        accounts.add(account);
        System.out.println("New account is opened: " + account);

    }
    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);

            if (account.getAccNumber() == accNumber) {
                accounts.remove(i);
                System.out.println("Closed account #" + accNumber);
                return;
            }
        }

        System.out.println("Account #" + accNumber + " not found");
    }

    public void update(){
        for(Account account : accounts){
            if(account instanceof CheckingAccount){
                ((CheckingAccount) account).deductFee();
            }
            else if(account instanceof SavingAccount){
                ((SavingAccount) account).addInterest();
            }
        }
    }
    public void showAll(){
        System.out.println("<-Account->");
        for(Account account : accounts) account.print();
    }
}
