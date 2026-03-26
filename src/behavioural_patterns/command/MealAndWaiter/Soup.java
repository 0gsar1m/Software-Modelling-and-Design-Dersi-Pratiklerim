package behavioural_patterns.command.MealAndWaiter;

public class Soup implements Meal {

    @Override
    public void cook() {
        System.out.println("Soup is cooked.");
    }
}
