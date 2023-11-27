# Java Banking Application - OOP Concepts Demonstration

This Java banking application serves as a basic example to understand core Object-Oriented Programming (OOP) concepts. It simulates a digital bank offering two types of accounts (checking and savings) and provides functionalities such as deposit, withdrawal, and transfer.

## Core OOP Concepts in the Application

### Abstraction
- **Explanation**: Abstraction involves focusing on the essential qualities of something rather than one specific instance. In programming, it means focusing on 'what it does' rather than 'how it does it'.
- **Implementation**: The `Account` class in our application is an abstraction representing a general bank account. Specific details, like the type of account, are abstracted away, leaving only the essential operations like `deposit`, `withdraw`, and `transfer`.

### Encapsulation
- **Explanation**: Encapsulation is about bundling data and the methods that operate on that data into a single unit, and restricting the access to the details of the implementation.
- **Implementation**: In the application, the `Client` class encapsulates the name of the client. The `Account` class encapsulates details like balance and client information, providing methods like `deposit()` and `withdraw()` to interact with these properties.

### Inheritance
- **Explanation**: Inheritance is a mechanism where a new class inherits properties and behavior from an existing class. It promotes code reuse and relationship between classes.
- **Implementation**: `CheckingAccount` and `SavingsAccount` classes inherit from the `Account` class, reusing its properties and methods while adding specific functionalities like different types of account statements.

### Polymorphism
- **Explanation**: Polymorphism allows objects of different classes to be treated as objects of a common superclass. It's a concept where a single interface can represent different underlying forms (data types).
- **Implementation**: Both `CheckingAccount` and `SavingsAccount` are treated as `Account`. This allows for operations on collections of accounts where specific behaviors (like `printStatement()`) depend on the actual account type at runtime.

## Setup and Run

- Ensure Java is installed on your system.
- Compile and run the `Main` class to start the application.

## Example Usage
```java
Client client = new Client();
client.setName("John Doe");
Account checkingAccount = new CheckingAccount(client);
Account savingsAccount = new SavingsAccount(client);

checkingAccount.deposit(500);
checkingAccount.withdraw(200);
checkingAccount.transfer(100, savingsAccount);

checkingAccount.printStatement();
savingsAccount.printStatement();
