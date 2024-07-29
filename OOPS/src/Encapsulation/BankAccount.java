//3. Implement a class representing a bank account using encapsulation to protect sensitive data.
package Encapsulation;
import java.util.Scanner;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber,String accountHolderName,double balance) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        if(balance>=0) {
            System.out.println("initial balance: "+balance);
        } else {
        	System.out.println("Initial balance cannot be negative");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName=accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if(amount>0){
            balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }
    // Method to withdraw money
    public void withdraw(double amount1) {
        if(amount1>0 && amount1<=balance) {
            balance-=amount1;
        }else{
            System.out.println("Invalid withdrawal amount");
        }
    }
    public static void main(String[]args){
        BankAccount account=new BankAccount("123456789","mouni",1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an amount to deposit");
        double amount=sc.nextDouble();
        account.deposit(amount);
        System.out.println("Balance after deposit: " + account.getBalance());
        System.out.println("enter an amount to withdrawl");
        double amount1=sc.nextDouble();
        account.withdraw(amount1);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        account.setAccountHolderName("A");
        System.out.println("Updated Account Holder Name: " + account.getAccountHolderName());
    }
}
