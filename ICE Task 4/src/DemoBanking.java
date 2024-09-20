// DemoBanking.java
import java.util.Scanner;

public class DemoBanking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println("Enter account number for Checking Account: ");
        checkingAccount.setAccountNumber(input.nextInt());
        System.out.println("Enter initial deposit for Checking Account: ");
        checkingAccount.deposit(input.nextDouble());
        System.out.println("Enter overdraft limit for Checking Account: ");
        checkingAccount.setOverdraftLimit(input.nextDouble());

        // SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("Enter account number for Savings Account: ");
        savingsAccount.setAccountNumber(input.nextInt());
        System.out.println("Enter initial deposit for Savings Account: ");
        savingsAccount.deposit(input.nextDouble());
        System.out.println("Enter interest rate for Savings Account: ");
        savingsAccount.setInterestRate(input.nextDouble());

        // Display CheckingAccount details
        System.out.println("\nChecking Account details:");
        System.out.println("Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Balance: $" + checkingAccount.getBalance());
        System.out.println("Overdraft Limit: $" + checkingAccount.getOverdraftLimit());

        // Display SavingsAccount details and apply interest
        System.out.println("\nSavings Account details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");

        savingsAccount.applyInterest();
        System.out.println("Balance after interest: $" + savingsAccount.getBalance());
    }
}
