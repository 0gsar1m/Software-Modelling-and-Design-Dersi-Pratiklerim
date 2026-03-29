package behavioural_patterns.command.RunnableMealAndWaiter;

public class Kebab implements Meal {

    @Override
    public void cook() {
        System.out.println("Kebab is cooked.");
    }
    @Override
    public String toString() {
        return "Kebab Order";
    }
}
