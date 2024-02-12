public class BankAccount {
    private String accNo;
    private double balance;
    private static int countAcc = 0;

    public BankAccount() {
        this.accNo = createBankAccNo();
        this.balance = 0.0;
        countAcc++;
    }

    private static String createBankAccNo(){
        return "24B0" + countAcc;
    }

    public static int getCountAcc() {
        return countAcc;
    }

    public void deposit(double amt){
        if (amt > 0) {
            balance += amt;
            System.out.println("Acc No:" + accNo);
            System.out.println(amt + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && balance >= amt) {
            balance -= amt;
            System.out.println("Acc No:" + accNo);
            System.out.println(amt + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }

    public void displayBalance() {
        System.out.println("Acc No:" + accNo);
        System.out.println("Current balance: " + balance);
    }

}
