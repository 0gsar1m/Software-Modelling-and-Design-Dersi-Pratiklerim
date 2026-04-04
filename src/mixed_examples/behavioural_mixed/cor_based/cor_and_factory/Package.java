package mixed_examples.behavioural_mixed.cor_based.cor_and_factory;

public class Package implements IPackage{
    private double weight;
    private String desc;
    public Package(double w, String d) { this.weight = w; this.desc = d; }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getDescription() {
        return desc;
    }
}
