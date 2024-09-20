// DemoPhoneCalls.java
import java.util.Scanner;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneCall phoneCall;

        while (true) {
            System.out.println("Enter call type (I for Incoming, O for Outgoing, Q to quit):");
            char callType = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

            if (callType == 'Q' || callType == 'q') {
                break;
            }

            System.out.println("Enter the phone number:");
            String phoneNumber = scanner.nextLine();

            if (callType == 'I' || callType == 'i') {
                phoneCall = new IncomingPhoneCall(phoneNumber);
            } else if (callType == 'O' || callType == 'o') {
                System.out.println("Enter the number of minutes:");
                int minutes = scanner.nextInt();
                phoneCall = new OutgoingPhoneCall(phoneNumber, minutes);
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println("Invalid call type.");
                continue;
            }

            phoneCall.displayCallInfo();
        }
    }
}
