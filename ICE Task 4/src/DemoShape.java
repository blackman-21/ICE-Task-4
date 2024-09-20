// DemoShape.java
import java.util.Scanner;

public class DemoShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose shape: 1 for Rectangle, 2 for Circle");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline

        Shapes shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter length of rectangle:");
                double length = input.nextDouble();
                System.out.println("Enter width of rectangle:");
                double width = input.nextDouble();
                shape = new Rectangles(length, width);
                break;
            case 2:
                System.out.println("Enter radius of circle:");
                double radius = input.nextDouble();
                shape = new Circles(radius);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
}
