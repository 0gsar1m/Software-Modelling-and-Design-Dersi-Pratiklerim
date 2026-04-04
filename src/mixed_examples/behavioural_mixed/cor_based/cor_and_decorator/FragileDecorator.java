package mixed_examples.behavioural_mixed.cor_based.cor_and_decorator;

public class FragileDecorator extends PackageDecorator{

    public FragileDecorator(IPackage cargo) {
        super(cargo);
    }

    public String getDescription() {
        return cargo.getDescription() + " [FRAGILE] ";
    }

    public double getWeight() {
        return cargo.getWeight();
    }

}
