package mixed_examples.behavioural_mixed.cor_based.cor_and_factory;

public class SmallPackageCarrier extends Carrier{
    private final int max_weight = 12;

    @Override
    public IDocument createDoc(String details) {
        IDocument smallDoc = new SmallDoc(details);
        return smallDoc;
    }

    @Override
    public void handlePackage(IPackage pac) {
        if(pac.getWeight() < max_weight){
            carry(pac);
            createDoc("SMALL PACKAGE DOCS CREATED");
        }else if (super.nextCarrier != null){
            nextCarrier.handlePackage(pac);
        }else {
            System.out.println("[ERROR]");
        }
    }

    @Override
    public void carry(IPackage pac) {
        System.out.println("Carrying small package");
    }
}
