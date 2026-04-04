package structural_patterns.bridge.ex3;

public class FragileCargo extends Cargo{

    public FragileCargo(String name, IDelivery deliveryType) {
        super(name, deliveryType);
    }

    @Override
    public void processShipment() {
        System.out.println("[FRAGILE]: " + name);
        delivery.deliver();
    }
}
