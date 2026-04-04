package mixed_examples.behavioural_mixed.cor_based.cor_and_adapter;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public abstract void handleRequest(SupportRequest request);

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
