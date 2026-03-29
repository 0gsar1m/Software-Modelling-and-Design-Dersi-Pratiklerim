package behavioural_patterns.command.RunnableMealAndWaiter;

import behavioural_patterns.command.MealAndWaiter.Kebab;

public class Main {
    static void main() {
        Waiter w=new Waiter();
        w.takeOrder(new Soup()::cook);
        w.takeOrder(new Kebab()::cook);
        w.takeOrder(new Kebab()::cook);
        w.takeOrder(new Soup()::cook);

        w.deliverOrders();

    }
}
