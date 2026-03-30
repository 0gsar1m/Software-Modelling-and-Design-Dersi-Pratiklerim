package mixed_examples.behavioural_mixed.cor_and_decorator;

public class BigCarrier extends Carrier {
    private static final int maxWeight = 50;

    @Override
    public void carry(IPackage cargo) {
        System.out.println("Carried by Big Carrier: " + cargo.getDescription());
    }

    @Override
    public void handle(IPackage cargo) {
        if (cargo.getWeight() <= maxWeight) {
            carry(cargo);
        } else if (nextCarrier != null) {
            System.out.println(getClass().getSimpleName() + " package is too heavy, passing to next...");
            nextCarrier.handle(cargo);
        } else {
            System.out.println("[ERROR]");
        }
    }
}
