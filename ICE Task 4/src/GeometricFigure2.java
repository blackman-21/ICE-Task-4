// GeometricFigure2.java
public abstract class GeometricFigure2 implements SidedObject {
    protected double height;
    protected double width;
    protected String figureType;

    public GeometricFigure2(double height, double width, String figureType) {
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    public abstract double calculateArea();

    public abstract void displaySides();
}
