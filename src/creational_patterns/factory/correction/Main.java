package creational_patterns.factory.correction;

public class Main {
    static void main() {
        IVehicle carObj = VehicleFactory.createVehicle("cAR");
        carObj.drive(); //output: Car is vrom vrom

        IVehicle motorcycleObj = VehicleFactory.createVehicle("motorcycle");
        motorcycleObj.drive(); //output: Motorcycle goes brrr

        //It's dope innit? No new object on Client side.
        /*U might think "what if we gave as Constructor parameter like VehicleFactory("Car") etc."
        In that case u'ld be produce a "car factory" that wont be able to produce anythimng else bcs
        It'll have a state variable "private final vehicleType etc."

        VehicleFactory carFactory = new VehicleFactory("Car");
        Vehicle myCar = carFactory.create();

        a second later u want to produce Truck:

        VehicleFactory truckFactory = new VehicleFactory("Truck");
        Vehicle myTruck = truckFactory.create();

        like, come on. 2 new factories? lol
         */
    }

}
