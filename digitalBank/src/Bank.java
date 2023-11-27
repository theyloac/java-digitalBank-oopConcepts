import java.util.List;

// Represents a bank with a name and a list of accounts
public class Bank {

    private String name;
    private List<Account> accounts;

    // Getter for the bank name
    public String getName() {
        return name;
    }

    // Setter for the bank name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the list of accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    // Setter for the list of accounts
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
