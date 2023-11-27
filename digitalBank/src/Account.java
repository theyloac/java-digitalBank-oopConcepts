// Abstract class representing a general account
public abstract class Account implements IAccount {
    
    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    // Constructor for the account
    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    // Method to withdraw money from the account
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Method to deposit money into the account
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to transfer money to another account
    @Override
    public void transfer(double amount, IAccount destinationAccount) {
        this.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    // Getter for the agency number
    public int getAgency() {
        return agency;
    }

    // Getter for the account number
    public int getNumber() {
        return number;
    }

    // Getter for the account balance
    public double getBalance() {
        return balance;
    }

    // Method to print common account information
    protected void printCommonInfo() {
        System.out.println(String.format("Holder: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
}
