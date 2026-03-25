package behavioural_patterns.chain_of_responsibility.CustomerSupport;

public class SupportRequest {

    private Level lvl;
    private String message;

    public SupportRequest(String message, Level lvl) {
        this.lvl = lvl;
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public Level getLevel() {
        return lvl;
    }

    @Override
    public String toString() {
        return "Support Request: " + message +
                ", Level: " + lvl;
    }
}
