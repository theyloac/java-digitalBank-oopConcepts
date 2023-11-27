// Represents a savings account, extending the Account class
public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    // Method to print the account statement
    @Override
    public void printStatement() {
        System.out.println("=== Savings Account Statement ===");
        super.printCommonInfo();
    }
}
