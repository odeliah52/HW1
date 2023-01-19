import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating some accounts
        StandardAccount standardAccount = new StandardAccount(1, -100);
        BasicAccount basicAccount = new BasicAccount(2, 100);
        PremiumAccount premiumAccount = new PremiumAccount(3);

        // Adding accounts to the bank
        bank.OpenAccount(standardAccount);
        bank.OpenAccount(basicAccount);
        bank.OpenAccount(premiumAccount);

        // Depositing money
        standardAccount.Deposit(100);
        basicAccount.Deposit(200);
        premiumAccount.Deposit(300);

        // Withdrawing money
        standardAccount.Withdraw(500);
        basicAccount.Withdraw(300);
        premiumAccount.Withdraw(200);

        // Printing account info
        System.out.println("Standard Account Info:");
        System.out.println("Account Number: " + standardAccount.GetAccountNumber());
        System.out.println("Current Balance: " + standardAccount.GetCurrentBalance());

        // Printing the accounts in debt
        List<IAccount> accountsInDebt = bank.GetAllAccountsInDebt();
        System.out.println("Accounts in Debt:");
        for (IAccount account : accountsInDebt) {
            System.out.println("Account Number: " + account.GetAccountNumber() + " Balance: " + account.GetCurrentBalance());
        }

        // Printing the accounts with balance above a certain amount
        List<IAccount> accountsWithBalance = bank.GetAllAccountsWithBalance(150);
        System.out.println("Accounts with Balance above 150:");
        for (IAccount account : accountsWithBalance) {
            System.out.println("Account Number: " + account.GetAccountNumber() + " Balance: " + account.GetCurrentBalance());
        }
    }
}

