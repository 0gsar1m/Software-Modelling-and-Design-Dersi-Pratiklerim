package structural_patterns.bridge.ex3;

public abstract class Cargo {
    String name;
    protected IDelivery delivery;

    public Cargo(String name, IDelivery deliveryType){
        this.name = name;
        this.delivery = deliveryType;
    }

    public abstract void processShipment();

}
