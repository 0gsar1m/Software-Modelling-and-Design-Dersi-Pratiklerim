package structural_patterns.mixed.proxy_and_singleton;

public class Main {
    public static void main(String[] args) {
        // STEP 1: Create the Proxy object.
        // Note: The "getting instance" message from MySqlConnection should NOT appear yet!
        System.out.println("--- STEP 1: Proxy Object Created ---");
        IDBConnection proxy = new ProxyMysqlDbConnection();
        System.out.println("Proxy is on standby. MySQL instance has not been created yet.");

        System.out.println("\n--- STEP 2: First Connection Request ---");
        // Proxy will check 'mysql == null' and call MySqlConnection.getInstance()
        IDBConnection conn1 = proxy.connect();

        System.out.println("\n--- STEP 3: Second Connection Request ---");
        // Proxy will find 'mysql != null' and reuse the existing instance.
        // We should NOT see the "getting instance" message again!
        IDBConnection conn2 = proxy.connect();

        System.out.println("\n--- STEP 4: Singleton Proof (Reference Comparison) ---");
        // Compare memory addresses to ensure it's the same object.
        if (conn1 == conn2) {
            System.out.println("PROOF: conn1 and conn2 point to the SAME memory address.");
            System.out.println("Object HashCode: " + System.identityHashCode(conn1));
            System.out.println("RESULT: SUCCESS! Singleton and Proxy are working in perfect harmony.");
        } else {
            System.out.println("ERROR: Different objects were created! Singleton pattern is broken.");
        }
    }
}