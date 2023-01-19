public class BasicAccount implements IAccount {

    //State
    private int accountNumber;
    private double withdrawalLimit;
    private double balance;

    //Constructor

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = withdrawalLimit;
        this.balance = 0;
    }

    //Behaviour

    public void Deposit(double amount) {
        this.balance += amount;
    }

    public double Withdraw(double amount) {
        if (amount > this.withdrawalLimit) {
            amount = this.withdrawalLimit;
        }
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
