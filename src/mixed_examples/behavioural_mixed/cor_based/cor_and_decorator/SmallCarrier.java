package mixed_examples.behavioural_mixed.cor_based.cor_and_decorator;

public class SmallCarrier extends Carrier {
    private static final int maxWeight = 20;

    @Override
    public void carry(IPackage cargo) {
        System.out.println("Carried by Small Carrier: " + cargo.getDescription());
    }

    @Override
    public void handle(IPackage cargo) {
        if (cargo.getWeight() <= maxWeight) {
            carry(cargo);
        } else if (nextCarrier != null) {
            System.out.println(getClass().getSimpleName() + " kapasiteyi aştı, bir üste paslıyor...");
            nextCarrier.handle(cargo);
        } else {
            System.out.println("[ERROR]");
        }
    }
}

