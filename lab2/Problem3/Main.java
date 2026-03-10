package lab2.Problem3;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // создаём счета
        SavingAccount saving = new SavingAccount(1001, 5); 
        CheckingAccount checking = new CheckingAccount(2001);

        // открываем счета
        bank.openAccount(saving);
        bank.openAccount(checking);

        // операции
        saving.deposit(1000);
        checking.deposit(500);
        checking.withdraw(100);
        checking.deposit(200);
        checking.withdraw(50);

        // показываем счета
        bank.showAll();

        // обновление банка (начисление процентов и комиссий)
        System.out.println("\n--- Bank Update ---");
        bank.update();

        bank.showAll();

        // перевод
        System.out.println("\n--- Transfer ---");
        saving.transfer(200, checking);

        bank.showAll();

        // закрытие счета
        System.out.println("\n--- Closing account ---");
        bank.closeAccount(2001);

        bank.showAll();
    }
}