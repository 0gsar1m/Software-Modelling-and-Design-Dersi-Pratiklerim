package mixed_examples.behavioural_mixed.cor_and_decorator;

public abstract class PackageDecorator implements IPackage {
    protected IPackage cargo;

    public PackageDecorator(IPackage cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getDescription() {
        return cargo.getDescription();
    }

    @Override
    public double getWeight() {
        return cargo.getWeight();
    }
}
