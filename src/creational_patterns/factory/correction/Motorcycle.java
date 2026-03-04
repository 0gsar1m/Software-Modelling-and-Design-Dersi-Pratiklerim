package creational_patterns.factory.correction;

public class Motorcycle implements IVehicle{
    //Just adding a class, no refactor. Thus, the open close principle will be satisfied too
    @Override
    public void drive() {
        System.out.println("Motorcycle goes brrr");
    }
}
