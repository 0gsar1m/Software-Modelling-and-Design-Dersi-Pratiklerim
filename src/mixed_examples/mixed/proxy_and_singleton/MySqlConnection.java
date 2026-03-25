package mixed_examples.mixed.proxy_and_singleton;

public class MySqlConnection implements IDBConnection{
    private static MySqlConnection instance;

    private MySqlConnection(){    }

    public static MySqlConnection getInstance() {
        if (instance == null) {
            instance = new MySqlConnection();
        }
        return instance;
    }

    @Override
    public IDBConnection connect() {
        System.out.println("MySQL connected.");
        return null;
    }
}
