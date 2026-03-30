package structural_patterns.composite.ex2;

public class SinglePackage implements IShippable {
    private String name;
    private double weight;

    public SinglePackage(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " (" + weight + " kg)");
    }
}
