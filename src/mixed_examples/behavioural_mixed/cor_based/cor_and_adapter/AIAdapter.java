package mixed_examples.behavioural_mixed.cor_based.cor_and_adapter;

public class AIAdapter extends SupportHandler {
    private ExternalAIService externalAIService;

    public AIAdapter(ExternalAIService ext) {
        this.externalAIService = ext;
    }

    @Override
    public void handleRequest(mixed_examples.behavioural_mixed.cor_based.cor_and_adapter.SupportRequest request) {
        try {
            externalAIService.provideAIAssistance(request.getMessage());
        } catch (Exception e) {
            if (super.nextHandler != null) {
                System.out.println(" (AI) FORWARDING request to next handler - " + request);
                super.nextHandler.handleRequest(request);
            } else {
                System.out.println("Leave request cannot be processed at this time.");
            }
        }
    }
}
