package structural_patterns.mixed.proxy_and_singleton;

public class ProxyMysqlDbConnection implements IDBConnection{
    private MySqlConnection mysql;

    @Override
    public IDBConnection connect() {
        if (mysql == null){
            System.out.println("getting MySqlConnection instance");
            mysql = MySqlConnection.getInstance();
        }
        mysql.connect();
        return mysql;
    }
}
