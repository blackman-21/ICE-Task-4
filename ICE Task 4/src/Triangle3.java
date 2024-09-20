// Triangle3.java
public class Triangle3 extends GeometricFigure2 {
    public Triangle3(double height, double base) {
        super(height, base, "Triangle");
    }

    @Override
    public double calculateArea() {
        return (height * width) / 2;
    }

    @Override
    public void displaySides() {
        System.out.println("Triangle has 3 sides.");
    }
}
