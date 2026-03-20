package structural_patterns.mixed.decorator_and_factory;

public class SportsCar implements ICar{
    private boolean hasSpecialEquipment = false;
    private boolean hasLuxuryInterior = false;

    @Override
    public void showSpecs() {
        System.out.println("SportsCar -> Special Equipment: " + hasSpecialEquipment + ", Luxury: " + hasLuxuryInterior);
    }

    @Override
    public void setSpecialEquipment(boolean status) {
        this.hasSpecialEquipment = status;
    }

    @Override
    public void setLuxuryInterior(boolean status) {
        this.hasLuxuryInterior = status;
    }
}
