// Square2.java
public class Square2 extends GeometricFigure2 {
    public Square2(double side) {
        super(side, side, "Square");
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void displaySides() {
        System.out.println("Square has 4 sides.");
    }
}

