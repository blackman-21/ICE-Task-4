// Square.java
public class Square extends GeometricFigure {
    public Square(double side) {
        super(side, side, "Square");
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
