package mixed_examples.mixed.decorator_and_factory;

public abstract class CarFactoryDecorator implements ICarFactory {
    protected ICarFactory carToBeProduced;

    public CarFactoryDecorator(ICarFactory carToBeProduced) {
        this.carToBeProduced = carToBeProduced;
    }

    @Override
    public ICar createCar(String carType) {
        return carToBeProduced.createCar(carType);
    }
}
