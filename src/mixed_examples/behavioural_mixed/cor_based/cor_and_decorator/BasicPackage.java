package mixed_examples.behavioural_mixed.cor_based.cor_and_decorator;

//concrete IPackage
public class BasicPackage implements IPackage{
    private double weight;

    public BasicPackage(double weight){
        this.weight = weight;
    }

    @Override
    public String getDescription() {
        return "Standart Package";
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
