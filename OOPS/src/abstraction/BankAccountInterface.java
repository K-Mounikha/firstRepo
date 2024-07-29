//20.Create an interface for a bank account, with methods for depositing, withdrawing, and checking the balance.
package abstraction;
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
public class BankAccountInterface implements BankAccount {
    private double balance;

    public BankAccountInterface(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccountInterface account = new BankAccountInterface(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());
    }
}


