// CheckingAccount.java
public class CheckingAccount extends BankingAccount {
    private double overdraftLimit;

    public void setOverdraftLimit(double limit) {
        this.overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (amount <= getBalance() + overdraftLimit)) {
            super.withdraw(amount);
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
