public class OrderService {
    public void save(String orderId){
        Connection connection = new Connection(host: "localhost", username: "root", password: "root");
        connection.sql("INSERT INTO ORDER ....");
        
    }
}