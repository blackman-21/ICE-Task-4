import java.util.Scanner;

public class DemoTees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TeeShirt object
        TeeShirt tee1 = new TeeShirt();
        System.out.print("Enter TeeShirt order number: ");
        tee1.setOrderNumber(input.nextInt());
        input.nextLine(); // Consume leftover newline
        System.out.print("Enter TeeShirt size: ");
        tee1.setSize(input.nextLine());
        System.out.print("Enter TeeShirt color: ");
        tee1.setColor(input.nextLine());

        // CustomTee object
        CustomTee customTee = new CustomTee();
        System.out.print("Enter Custom Tee order number: ");
        customTee.setOrderNumber(input.nextInt());
        input.nextLine(); // Consume leftover newline
        System.out.print("Enter Custom Tee size: ");
        customTee.setSize(input.nextLine());
        System.out.print("Enter Custom Tee color: ");
        customTee.setColor(input.nextLine());
        System.out.print("Enter Custom Tee slogan: ");
        customTee.setSlogan(input.nextLine());

        // Display details
        System.out.println("\nTeeShirt Details:");
        System.out.println("Order Number: " + tee1.getOrderNumber());
        System.out.println("Size: " + tee1.getSize());
        System.out.println("Color: " + tee1.getColor());
        System.out.println("Price: $" + tee1.getPrice());

        System.out.println("\nCustom Tee Details:");
        System.out.println("Order Number: " + customTee.getOrderNumber());
        System.out.println("Size: " + customTee.getSize());
        System.out.println("Color: " + customTee.getColor());
        System.out.println("Slogan: " + customTee.getSlogan());
        System.out.println("Price: $" + customTee.getPrice());
    }
}
