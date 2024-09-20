// DemoRocks.java
import java.util.Scanner;

public class DemoRocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the type of Rock (U for Unclassified, I for Igneous, S for Sedimentary, M for Metamorphic):");
        String rockType = input.nextLine();
        Rock rock;

        if (rockType.equalsIgnoreCase("I")) {
            rock = new IgneousRock(1, 5.0);
        } else if (rockType.equalsIgnoreCase("S")) {
            rock = new SedimentaryRock(2, 3.5);
        } else if (rockType.equalsIgnoreCase("M")) {
            rock = new MetamorphicRock(3, 4.0);
        } else {
            rock = new Rock(0, 0.0) {};
            System.out.println("Rock type is unclassified.");
        }

        System.out.println("Rock Sample Number: " + rock.getSampleNumber());
        System.out.println("Rock Weight: " + rock.getWeight() + " kg");
        System.out.println("Rock Description: " + rock.getDescription());
    }
}
