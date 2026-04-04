package structural_patterns.bridge.ex3;

public class Main {
    static void main() {
        IDelivery plane = new PlaneDelivery();
        IDelivery truck = new TruckDelivery();

        Cargo c1 = new FragileCargo("Glass", plane);
        Cargo c2 = new StandartCargo("Horses", truck);

        c1.processShipment();
        System.out.println("--------------");
        c2.processShipment();
    }
}
