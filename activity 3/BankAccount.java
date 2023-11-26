public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);  // Create a BankAccount object with an initial balance of 1000.0
        account.withdraw(500.0);  // Try to withdraw 500.0 from the account
    }
}
