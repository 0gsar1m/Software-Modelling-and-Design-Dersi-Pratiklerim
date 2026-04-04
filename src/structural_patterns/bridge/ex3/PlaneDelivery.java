package structural_patterns.bridge.ex3;

public class PlaneDelivery implements IDelivery{
    @Override
    public void deliver() {
        System.out.println("Delivering with plane");
    }
}
