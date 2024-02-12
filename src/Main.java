public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.deposit(1000);
        account2.deposit(500);
        account1.withdraw(200);
        account2.withdraw(100);

        account1.displayBalance();
        account2.displayBalance();

        System.out.println("Total accounts created: " + BankAccount.getCountAcc());
    }
}