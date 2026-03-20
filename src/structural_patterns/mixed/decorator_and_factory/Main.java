package structural_patterns.mixed.decorator_and_factory;

public class Main {
    static void main() {
        //Producing standard Basic Car
        ICarFactory basicFactory = new BasicCarFactory();
        ICar basicCar = basicFactory.createCar("Sports");
        basicCar.showSpecs(); //OUTPUT: SportsCar -> Special Equipment: false, Luxury: false

        System.out.println("\n--- Modifying the Production Line ---");

        ICarFactory modifiedFactory = new LuxuryInteriorFactoryDecorator( //new products will be modified by their factory
                                        new SpecialEquipmentFactoryDecorator(basicFactory));


        ICar modifiedJeep = modifiedFactory.createCar("Jeep");
        modifiedJeep.showSpecs(); //OUTPUT: Jeep -> Special Equipment: true, Luxury: true
        System.out.println("------------------------------");
        ICar modifiedSportsCar = modifiedFactory.createCar("Sports");
        modifiedSportsCar.showSpecs(); //OUTPUT: SportsCar -> Special Equipment: true, Luxury: true

    }
}
