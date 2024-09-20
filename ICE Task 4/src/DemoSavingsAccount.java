// DemoSavingsAccount.java
import java.util.Scanner;

public class DemoSavingsAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account holder name:");
        String name = input.nextLine();
        System.out.println("Enter initial balance:");
        double initialBalance = input.nextDouble();
        System.out.println("Enter interest rate (%):");
        double interestRate = input.nextDouble();
        input.nextLine(); // Consume newline

        SavingAccount account = new SavingAccount(name, initialBalance, interestRate);

        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply Interest");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.applyInterest();
                    break;
                case 4:
                    account.displayBalance();
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
