package SOLID.Liskov.Violation;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();  // LSP Violation started!

        // Customer thinks It's a usual area calculation:
        rectangle.setWidth(5);   // Customer sets "g=5". (At square, y=5 same time)
        rectangle.setHeight(10); // Customer sets "y=10". (At square, g=10 same time)
        System.out.println("Expected Area: 5 * 10 = 50");
        System.out.println("Actual Area: " + rectangle.getArea());  // OUTPUT: 100 !?!
    }
}
