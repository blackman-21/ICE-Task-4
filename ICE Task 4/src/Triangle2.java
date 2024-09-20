// Triangle.java
public class Triangle2 extends GeometricFigure {
    public Triangle2(double height, double base) {
        super(height, base, "Triangle");
    }

    @Override
    public double calculateArea() {
        return (height * width) / 2;
    }
}