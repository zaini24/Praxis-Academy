public class OrderDetailService {
    public void save(String orderId, String product){
        Connection connection = new Connection(host: "localhost", username: "root", password: "root");
        connection.sql("INSERT INTO ORDER_DETAILS....");
    }
}