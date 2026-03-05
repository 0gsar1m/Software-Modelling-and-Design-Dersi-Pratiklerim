package SOLID.OpenClosed.Corrected;

public class AreaCalculator {
    public double calculateArea(IShape shape){
        return shape.calculate();
    }
}
