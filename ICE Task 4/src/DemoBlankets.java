// DemoBlankets.java
import java.util.Scanner;

public class DemoBlankets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Blanket
        Blanket blanket = new Blanket();
        System.out.println("Initial Blanket: " + blanket);

        String input;
        while (true) {
            System.out.println("Enter material (Cotton, Wool, Cashmere) or 'Q' to quit:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) break;

            blanket.setMaterial(input);
            System.out.println(blanket);

            System.out.println("Enter size (Twin, Double, Queen, King) or 'Q' to quit:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) break;

            blanket.setSize(input);
            System.out.println(blanket);
        }

        // Electric Blanket
        ElectricBlanket electricBlanket = new ElectricBlanket();
        System.out.println("Initial Electric Blanket: " + electricBlanket);

        while (true) {
            System.out.println("Enter heat settings (1-5) or 'Q' to quit:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) break;

            int heatSettings = Integer.parseInt(input);
            electricBlanket.setHeatSettings(heatSettings);
            System.out.println(electricBlanket);

            System.out.println("Enable Auto Shutoff? (Y/N)");
            input = scanner.nextLine();
            electricBlanket.setHasAutoShutoff(input.equalsIgnoreCase("Y"));
            System.out.println(electricBlanket);
        }
    }
}
