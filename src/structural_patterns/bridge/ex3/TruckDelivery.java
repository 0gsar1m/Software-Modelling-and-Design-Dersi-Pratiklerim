package structural_patterns.bridge.ex3;

public class TruckDelivery implements IDelivery{
    @Override
    public void deliver() {
        System.out.println("Delivering with truck");
    }
}
