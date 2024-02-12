# BankAccount Class

The BankAccount class provides a simple representation of a bank account with basic functionalities such as deposit, withdrawal, and balance display.

## Class Overview

The BankAccount class consists of the following members:

### Fields:

- `accNo`: String - Represents the account number of the bank account.
- `balance`: double - Represents the current balance of the bank account.
- `countAcc`: int (static) - Keeps track of the total number of bank accounts created.

### Constructor:

- `BankAccount()`: Initializes a new instance of the BankAccount class with a unique account number and zero balance.

### Methods:

- `deposit(double amt)`: Deposits the specified amount into the account.
- `withdraw(double amt)`: Withdraws the specified amount from the account.
- `displayBalance()`: Displays the account number and current balance of the account.
- `createBankAccNo()`: Private static method - Generates a unique account number for each new account.
- `getCountAcc()`: Public static method - Returns the total number of bank accounts created.

## Usage

```java
// Create a new bank account
BankAccount account = new BankAccount();

// Deposit funds into the account
account.deposit(1000);

// Withdraw funds from the account
account.withdraw(500);

// Display the current balance of the account
account.displayBalance();

// Get the total number of bank accounts created
int totalAccounts = BankAccount.getCountAcc();
System.out.println("Total accounts created: " + totalAccounts);
```

## Sample Output

```
1000 deposited successfully.
500 withdrawn successfully.
Acc No: BAC11224
Current balance: 500.0
Total accounts created: 1
```

## Contributing

Contributions are welcome! Please feel free to open a pull request.
