package structural_patterns.mixed.decorator_and_factory;

public class BasicCarFactory implements ICarFactory{
    @Override
    public ICar createCar(String carType) {
        if (carType.equalsIgnoreCase("Sports")) return new SportsCar();
        if (carType.equalsIgnoreCase("Jeep")) return new Jeep();
        return null;
    }
}
