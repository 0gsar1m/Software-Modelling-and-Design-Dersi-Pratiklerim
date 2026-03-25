package behavioural_patterns.chain_of_responsibility.CustomerSupport;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public abstract void handleRequest(SupportRequest request);

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
