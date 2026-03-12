package structural_patterns.decorator;

import creational_patterns.factory.violation.Car;

public abstract class CarDecorator implements ICar{
    protected ICar decoratedCar; //car will be swallowed by other
                                // Concrete Decorators (This class is abstract decorator)

    public CarDecorator(ICar decoratedCar){
        this.decoratedCar = decoratedCar;
    }

    //thing is, we're loading the "must" methods to abstract CarDecorator.
    // Thus, extended child classes won't have to
    // implement with @Override getCost() etc. u feel me?

    @Override
    public String getDescription() {
        return decoratedCar.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedCar.getCost();
    }

}
