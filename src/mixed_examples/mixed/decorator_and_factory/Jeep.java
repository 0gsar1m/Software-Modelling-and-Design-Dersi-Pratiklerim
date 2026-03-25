package mixed_examples.mixed.decorator_and_factory;

public class Jeep implements ICar {
    private boolean hasSpecialEquipment = false;
    private boolean hasLuxuryInterior = false;

    public void setSpecialEquipment(boolean status) {
        this.hasSpecialEquipment = status;
    }

    public void setLuxuryInterior(boolean status) {
        this.hasLuxuryInterior = status;
    }

    public void showSpecs() {
        System.out.println("Jeep -> Special Equipment: " + hasSpecialEquipment + ", Luxury: " + hasLuxuryInterior);
    }
}
