public class PremiumAccount implements IAccount {

    //State
    private int accountNumber;
    private double balance;

   //Constructor

    public PremiumAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    //Behaviour

    public void Deposit(double amount) {
        this.balance += amount;
    }

    public double Withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }

    public double GetCurrentBalance() {
        return this.balance;
    }

    public int GetAccountNumber() {
        return this.accountNumber;
    }
}
