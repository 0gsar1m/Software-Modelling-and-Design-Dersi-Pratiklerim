package structural_patterns.bridge.ex3;

public class StandartCargo extends Cargo{
    public StandartCargo(String name, IDelivery deliveryType) {
        super(name, deliveryType);
    }

    @Override
    public void processShipment() {
        System.out.println("[STANDARD]: " + name);
        delivery.deliver();
    }
}
