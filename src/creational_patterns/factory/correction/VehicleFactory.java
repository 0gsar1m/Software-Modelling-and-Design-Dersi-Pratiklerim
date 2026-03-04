package creational_patterns.factory.correction;

public class VehicleFactory {

    public static IVehicle createVehicle(String vehicleType){ //vehicle type to be produced
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        }else if (vehicleType.equalsIgnoreCase("Truck")) {
            return new Truck();
        }else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }
        return null;
    }

}
