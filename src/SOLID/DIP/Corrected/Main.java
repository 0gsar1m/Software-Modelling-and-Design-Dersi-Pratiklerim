package SOLID.DIP.Corrected;

public class Main {
    static void main() {
        IDatabase mysql = new MySQLDatabase();
        IDatabase postgresql = new PostgreSQLDatabase();

        OrderService orderService = new OrderService(mysql);
        orderService.placeOrder("Cocholate");
    }
}
