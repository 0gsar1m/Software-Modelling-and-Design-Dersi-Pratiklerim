package SOLID.Liskov.Corrected;

public class Main {
    static void main() {
        IShape square = new Square(5);
        IShape rectangle = new Rectangle(2,3);

        System.out.println("Square area: " + square.getArea() +
                         "\nRectangle area: " + rectangle.getArea());
    }
}
