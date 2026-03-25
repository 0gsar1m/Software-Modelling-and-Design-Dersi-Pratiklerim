package mixed_examples.behavioural_mixed.cor_and_proxy;

public class Main {
    static void main() {
        SupportRequest request = new SupportRequest("Help!", Level.MEDIUM);

        SupportHandler chatbot = new Chatbot();
        SupportHandler techteam = new TechTeam();
        SupportHandler senior = new SeniorEngineer();

        //wrapping the proxy over concrete handlers
        SupportHandler proxiedChatbot = new SupportProxy(chatbot);
        SupportHandler proxiedTech = new SupportProxy(techteam);
        SupportHandler proxiedSenior = new SupportProxy(senior);

        // Chatbot -> TechTeam -> Senior Engineer
        proxiedChatbot.setNextHandler(proxiedTech);
        proxiedTech.setNextHandler(proxiedSenior);

        //Scenarios
        System.out.println("Scenario 1: ");
        SupportRequest lowReq = new SupportRequest("How to change password?", Level.LOW);
        proxiedChatbot.handleRequest(lowReq);
        System.out.println();
        System.out.println("Scenario 2: ");
        SupportRequest highReq = new SupportRequest("There's a fire on server room", Level.HIGH);
        proxiedSenior.handleRequest(highReq);
    }
}
