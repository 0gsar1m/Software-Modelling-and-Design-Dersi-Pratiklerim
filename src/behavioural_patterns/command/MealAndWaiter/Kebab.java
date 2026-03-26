package behavioural_patterns.command.MealAndWaiter;

public class Kebab implements Meal {

    @Override
    public void cook() {
        System.out.println("Kebab is cooked.");
    }
}
