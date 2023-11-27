// Main class to run the application
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("ClientName");
        
        Account currentAccount = new CheckingAccount(client);
        Account savingsAccount = new SavingsAccount(client);

        currentAccount.deposit(100);
        currentAccount.transfer(100, savingsAccount);
        
        currentAccount.printStatement();
        savingsAccount.printStatement();
    }
}
