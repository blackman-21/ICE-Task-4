// DemoShapes.java
import java.util.Scanner;

public class DemoShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a shape: 1 for Rectangle, 2 for Circle, 3 for Triangle");
        int choice = input.nextInt();
        input.nextLine(); // Consume newline

        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter color:");
                String color = input.nextLine();
                System.out.println("Enter width:");
                double width = input.nextDouble();
                System.out.println("Enter height:");
                double height = input.nextDouble();
                shape = new Rectangle(color, width, height);
                break;
            case 2:
                System.out.println("Enter color:");
                color = input.nextLine();
                System.out.println("Enter radius:");
                double radius = input.nextDouble();
                shape = new Circle(color, radius);
                break;
            case 3:
                System.out.println("Enter color:");
                color = input.nextLine();
                System.out.println("Enter side1:");
                double side1 = input.nextDouble();
                System.out.println("Enter side2:");
                double side2 = input.nextDouble();
                System.out.println("Enter side3:");
                double side3 = input.nextDouble();
                shape = new Triangle(color, side1, side2, side3);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println(shape);
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}
