package SOLID.OpenClosed.Corrected;

public class Rectangle implements IShape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculate() {
        return width * height;
    }
}
