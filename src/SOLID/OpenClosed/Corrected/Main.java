package SOLID.OpenClosed.Corrected;

public class Main {
    static void main() {
        AreaCalculator calculator = new AreaCalculator();
        IShape circle = new Circle(4);
        System.out.println(calculator.calculateArea(circle));
    }
}
