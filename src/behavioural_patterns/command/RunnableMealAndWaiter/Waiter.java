package behavioural_patterns.command.RunnableMealAndWaiter;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    public List<Runnable> orderList = new ArrayList<Runnable>();

    public void takeOrder(Runnable  command){
        orderList.add(command);
        System.out.println("Order taken: " + command.getClass().getSimpleName());
    }

    public void deliverOrders(){
        for (Runnable command : orderList){
            command.run();
        }
    }

}
