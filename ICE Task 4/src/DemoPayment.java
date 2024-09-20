// DemoPayment.java
import java.util.Scanner;

public class DemoPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose payment method: 1 for Credit Card, 2 for PayPal");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline

        Payment payment = null;

        switch (choice) {
            case 1:
                System.out.println("Enter card number:");
                String cardNumber = input.nextLine();
                payment = new CreditCardPayment(cardNumber);
                break;
            case 2:
                System.out.println("Enter PayPal email:");
                String email = input.nextLine();
                payment = new PayPalPayment(email);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Enter amount to be paid:");
        double amount = input.nextDouble();

        payment.processPayment(amount);
    }
}
