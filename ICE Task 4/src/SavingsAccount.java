// SavingsAccount.java
public class SavingsAccount extends BankingAccount {
    private double interestRate;

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }
}
