package mixed_examples.mixed.decorator_and_factory;

public class LuxuryInteriorFactoryDecorator extends CarFactoryDecorator {

    public LuxuryInteriorFactoryDecorator(ICarFactory factory) {
        super(factory);
    }

    @Override
    public ICar createCar(String carType) {
        ICar car = super.createCar(carType); //creating car as usual
        if (car != null) car.setLuxuryInterior(true); //setting true, default was "false"
        return car;
    }
}