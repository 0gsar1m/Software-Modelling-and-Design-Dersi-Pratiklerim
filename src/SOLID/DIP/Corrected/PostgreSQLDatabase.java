package SOLID.DIP.Corrected;

public class PostgreSQLDatabase implements IDatabase {
    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to PostgreSQL: " + order);
    }
}
