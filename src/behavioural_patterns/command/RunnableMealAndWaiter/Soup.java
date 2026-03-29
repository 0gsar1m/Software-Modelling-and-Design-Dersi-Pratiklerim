package behavioural_patterns.command.RunnableMealAndWaiter;

public class Soup implements Meal {

    @Override
    public void cook() {
        System.out.println("Soup is cooked.");
    }

    @Override
    public String toString() {
        return "Soup Order";
    }
}
