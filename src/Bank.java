import java.util.List;
import java.util.ArrayList;

public class Bank implements IBank {
    private final List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void OpenAccount(IAccount account) {
        this.accounts.add(account);
    }

    public void CloseAccount(int accountNumber) {
        for(IAccount account : this.accounts) {
            if(account.GetAccountNumber() == accountNumber) {
                if(account.GetCurrentBalance() < 0) {
                    System.out.println("Account is not closed due to debt");
                    return;
                }
                this.accounts.remove(account);
                return;
            }
        }
    }

    public List<IAccount> GetAllAccounts() {
        return this.accounts;
    }

    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for(IAccount account : this.accounts) {
            if(account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for(IAccount account : this.accounts) {
            if(account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}
