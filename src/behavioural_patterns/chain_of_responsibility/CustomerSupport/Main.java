package behavioural_patterns.chain_of_responsibility.CustomerSupport;

public class Main {
    static void main() {
        SupportRequest request = new SupportRequest("Help!",Level.MEDIUM);

        SupportHandler chatbot = new Chatbot();
        SupportHandler techteam = new TechTeam();
        SupportHandler senior = new SeniorEngineer();

        chatbot.setNextHandler(techteam);
        techteam.setNextHandler(senior);

        chatbot.handleRequest(request);
    }
}
