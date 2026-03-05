package SOLID.DIP.Corrected;

public class OrderService {
    private IDatabase db;
    public OrderService(IDatabase db){
        this.db = db;
    }

    public void placeOrder(String order){
        db.saveOrder("Cocholate");
        System.out.println("Order placed: " + order);
    }
}
