package mixed_examples.behavioural_mixed.cor_and_adapter;

public class Main {
    static void main() {
        SupportRequest request = new SupportRequest("Help!", Level.MEDIUM);

        SupportHandler chatbot = new Chatbot();
        SupportHandler techteam = new TechTeam();
        SupportHandler senior = new SeniorEngineer();
        SupportHandler ai = new AIAdapter(new ExternalAIService());

        chatbot.setNextHandler(ai);

        ai.setNextHandler(techteam);

        techteam.setNextHandler(senior);

        chatbot.handleRequest(request);
    }
}
