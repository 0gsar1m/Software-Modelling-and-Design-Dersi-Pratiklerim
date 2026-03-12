package structural_patterns.decorator;

//concrete decorator
public class TurboEngineDecorator extends CarDecorator {

    public TurboEngineDecorator(ICar decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public int getCost() {
        int turboAdditionalCost = 10000;    //just to show, a bit more line of code
        int mainCostOfCar = super.getCost();

        return mainCostOfCar + turboAdditionalCost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Turbo were added";
    }
}
