package SOLID.DIP.Corrected;

public class MySQLDatabase implements IDatabase{
    @Override
    public void saveOrder(String order) {
        System.out.println("Order saved to MySQL: " + order);
    }
}
