public class StandardAccount implements IAccount {

    //State
    private int accountNumber;
    private double creditLimit;
    private double balance;

    //Constructor

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        if(creditLimit > 0) {
            this.creditLimit = 0;
        }
        this.balance = 0;
    }

    //Behaviour

    public void Deposit(double amount) {
        this.balance += amount;
    }

    public double Withdraw(double amount) {
        if (amount > this.balance + this.creditLimit) {
            amount = this.balance + this.creditLimit;
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
