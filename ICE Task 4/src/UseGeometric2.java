// UseGeometric2.java
import java.util.Scanner;

public class UseGeometric2 {
    public static void main(String[] args) {
        GeometricFigure2[] figures = new GeometricFigure2[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Enter type of figure (square, triangle): ");
            String figureType = scanner.nextLine();
            System.out.println("Enter height: ");
            double height = scanner.nextDouble();
            System.out.println("Enter width: ");
            double width = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (figureType.equalsIgnoreCase("square")) {
                figures[i] = new Square2(height);
            } else if (figureType.equalsIgnoreCase("triangle")) {
                figures[i] = new Triangle3(height, width);
            }
        }

        for (GeometricFigure2 figure : figures) {
            System.out.println(figure.getFigureType() + ": Height = " + figure.getHeight() + ", Width = " + figure.getWidth() + ", Area = " + figure.calculateArea());
            figure.displaySides();
        }
    }
}
