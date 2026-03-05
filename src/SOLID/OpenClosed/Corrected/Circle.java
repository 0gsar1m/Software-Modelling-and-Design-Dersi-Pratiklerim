package SOLID.OpenClosed.Corrected;

public class Circle implements IShape {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }
}
