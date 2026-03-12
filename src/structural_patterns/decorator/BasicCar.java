package structural_patterns.decorator;

public class BasicCar implements ICar{
    private String carName;
    private int carCost;

    public BasicCar(String carName, int carCost){
        this.carCost = carCost;
        this.carName = carName;
    }

    @Override
    public String getDescription() {
        return "Name: " +  carName + "Cost: " + carCost;
    }

    @Override
    public int getCost() {
        return carCost;
    }
}
