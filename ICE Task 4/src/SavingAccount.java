// SavingsAccount.java
public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = (super.balance * interestRate) / 100;
        super.deposit(interest);
        System.out.println("Interest of $" + interest + " applied");
    }
}
