package mixed_examples.behavioural_mixed.cor_and_decorator;

public abstract class Carrier {
    protected Carrier nextCarrier;

    public void setNextCarrier(Carrier carrier){
        this.nextCarrier = carrier;
    }
    public abstract void carry(IPackage cargo);
    public abstract void handle(IPackage cargo);
}
