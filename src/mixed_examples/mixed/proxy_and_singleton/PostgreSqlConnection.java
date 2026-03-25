package mixed_examples.mixed.proxy_and_singleton;

public class PostgreSqlConnection implements IDBConnection{
    private static PostgreSqlConnection instance;

    private PostgreSqlConnection(){    }

    public static PostgreSqlConnection getInstance() {
        if (instance == null) {
            instance = new PostgreSqlConnection();
        }
        return instance;
    }

    @Override
    public IDBConnection connect() {
        System.out.println("PostgreSQL connected.");
        return null;
    }
}
