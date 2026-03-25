package mixed_examples.mixed.decorator_and_factory;

public class SpecialEquipmentFactoryDecorator extends CarFactoryDecorator {

    public SpecialEquipmentFactoryDecorator(ICarFactory yutulanFactory) {
        super(yutulanFactory);
    }

    @Override
    public ICar createCar(String carType) {
        ICar car = super.createCar(carType); //creating car as usual
        if (car != null) car.setSpecialEquipment(true); //setting true, default was "false"
        return car;
    }
}
