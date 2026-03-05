package SOLID.OpenClosed.Violation;

public class Main {
    static void main(String[] args) {

        //the moment u want to add Triangle, u're done. U gotta change AreaCalculator and it's if else.

        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
    }
}
