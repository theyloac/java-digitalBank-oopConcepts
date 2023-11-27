// Represents a current account, extending the Account class
public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    // Method to print the account statement
    @Override
    public void printStatement() {
        System.out.println("=== Current Account Statement ===");
        super.printCommonInfo();
    }
}
