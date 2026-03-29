package behavioural_patterns.command.MealAndWaiter;

public class Main {
    static void main() {
        Waiter w=new Waiter();
        w.takeOrder(new SoupCookCommand(new Soup()));
        w.takeOrder(new SoupCookCommand(new Soup()));
        w.takeOrder(new SoupCookCommand(new Soup()));
        w.takeOrder(new KebabCookCommand(new Kebab()));

        w.deliverOrders();
    }
}
