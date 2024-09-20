// UseDivision.java
import java.util.Scanner;

public class UseDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division;

        System.out.println("Enter 'D' for Domestic Division or 'I' for International Division:");
        char divisionType = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline

        System.out.println("Enter division name:");
        String divisionName = scanner.nextLine();

        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (divisionType == 'D' || divisionType == 'd') {
            System.out.println("Enter state:");
            String state = scanner.nextLine();
            division = new DomesticDivision(divisionName, accountNumber, state);
        } else if (divisionType == 'I' || divisionType == 'i') {
            System.out.println("Enter country:");
            String country = scanner.nextLine();

            System.out.println("Enter language:");
            String language = scanner.nextLine();

            division = new InternationalDivision(divisionName, accountNumber, country, language);
        } else {
            System.out.println("Invalid type. Exiting...");
            return;
        }

        division.display();
    }
}
