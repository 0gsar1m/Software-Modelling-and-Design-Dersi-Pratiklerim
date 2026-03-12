package structural_patterns.decorator;

//concrete decorator
public class SteelRimDecorator extends CarDecorator {
    public SteelRimDecorator(ICar decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public int getCost() {
        int rimsAdditionalCost = 8000;    //just to show, a bit more line of code
        int mainCostOfCar = super.getCost();

        return mainCostOfCar + rimsAdditionalCost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Steel Rims were added";
    }
}
