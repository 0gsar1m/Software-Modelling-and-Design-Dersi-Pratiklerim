package mixed_examples.behavioural_mixed.cor_based.cor_and_factory;

public class SmallDoc implements IDocument{
    private String details;

    public SmallDoc(String details){
        this.details = details;
    }

    @Override
    public void showDoc() {
        System.out.println("[SMALL DOC]: " + details);
    }
}
