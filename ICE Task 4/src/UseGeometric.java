// UseGeometric.java
import java.util.Scanner;

public class UseGeometric {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[5];
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
                figures[i] = new Square(height);
            } else if (figureType.equalsIgnoreCase("triangle")) {
                figures[i] = new Triangle2(height, width);
            }
        }

        for (GeometricFigure figure : figures) {
            System.out.println(figure.getFigureType() + ": Height = " + figure.getHeight() + ", Width = " + figure.getWidth() + ", Area = " + figure.calculateArea());
        }
    }
}
