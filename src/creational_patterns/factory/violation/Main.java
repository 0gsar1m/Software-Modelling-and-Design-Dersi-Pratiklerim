package creational_patterns.factory.violation;

public class Main {
    static void main() {
        Truck truck = new Truck();
        truck.drive();

        Car car = new Car();
        car.drive();

        //In a case we want to add motorcycle, we have to
    }
}
