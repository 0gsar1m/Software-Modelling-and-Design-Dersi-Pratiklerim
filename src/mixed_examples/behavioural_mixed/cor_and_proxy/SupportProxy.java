package mixed_examples.behavioural_mixed.cor_and_proxy;

public class SupportProxy extends SupportHandler{
    private SupportHandler realHandler; //a draw ("cekmece" in TR or just an instance we can say)

    public SupportProxy(SupportHandler realHandler) {
        this.realHandler = realHandler; //setting boss
    }

    @Override
    public void handleRequest(SupportRequest request) {
        // 1. PRE-PROCESS (Logging / Security) we give PROXY a chance to do something before calling real handler
        System.out.println("[PROXY LOG]: " + realHandler.getClass().getSimpleName() +
                " got a request. Level: " + request.getLevel());

        // 2. Directing to real handler
        realHandler.handleRequest(request); // It'll be directed to concrete handler by parameter at line 7

        // 3. OPTIONAL PROXY YAP
        System.out.println("[PROXY LOG]: " + realHandler.getClass().getSimpleName() + " succeeded.");
    }

    @Override // after executing handleRequest, we have to setNextHandler of realHandler (boss)
    public void setNextHandler(SupportHandler nextHandler) {
        realHandler.setNextHandler(nextHandler);
        //usually, we set this.nextHandler = nextHandler but in PROXY, we are connecting chain of out boss: realHandler
    }

}
