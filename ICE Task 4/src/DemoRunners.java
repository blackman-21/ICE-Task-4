// DemoRunners.java
import java.util.Scanner;

public class DemoRunners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a type of runner (machine, athlete, political candidate): ");
        String choice = scanner.nextLine();

        Runner runner;
        switch (choice.toLowerCase()) {
            case "machine":
                runner = new Machine();
                break;
            case "athlete":
                runner = new Athlete();
                break;
            case "political candidate":
                runner = new PoliticalCandidate();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        runner.run();
    }
}
