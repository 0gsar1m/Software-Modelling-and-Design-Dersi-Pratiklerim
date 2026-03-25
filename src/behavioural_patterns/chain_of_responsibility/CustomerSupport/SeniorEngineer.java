package behavioural_patterns.chain_of_responsibility.CustomerSupport;

public class SeniorEngineer extends SupportHandler{
    private static final Level lvl = Level.HIGH;

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == lvl) {
            System.out.println("Chatbot responded to support request: " + request);
        } else if (super.nextHandler != null) {
            System.out.println(" (Chatbot) FORWARDING request to next handler - " + request);
            super.nextHandler.handleRequest(request);
        }else{
            System.out.println("Leave request cannot be processed at this time.");
        }
    }
}
