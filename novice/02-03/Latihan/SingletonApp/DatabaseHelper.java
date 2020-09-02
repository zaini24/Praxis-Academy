package SingletonApp;
public class DatabaseHelper {
    private static Connection connection;
    public static Connection getConnection(){
        (connection == null){
            connection = new Connection(host: "localhost", username: "root", password: "root"
        }
        return connection;
    }
}