// DemoTurners.java
import java.util.Scanner;

public class DemoTurners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a type of turner (leaf, page, pancake): ");
        String choice = scanner.nextLine();

        Turner turner;
        switch (choice.toLowerCase()) {
            case "leaf":
                turner = new Leaf();
                break;
            case "page":
                turner = new Page();
                break;
            case "pancake":
                turner = new Pancake();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        turner.turn();
    }
}

