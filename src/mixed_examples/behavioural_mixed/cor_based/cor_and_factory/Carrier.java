package mixed_examples.behavioural_mixed.cor_based.cor_and_factory;

public abstract class Carrier {
    protected Carrier nextCarrier;

    public abstract IDocument createDoc(String details);

    public void setNextCarrier(Carrier nextCarrier){
        this.nextCarrier = nextCarrier;
    }

    public abstract void handlePackage(IPackage pac);

    public abstract void carry(IPackage pac);

}
