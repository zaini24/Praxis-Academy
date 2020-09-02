package SingletonApp;
public class OrderService {
    public void save(String orderId){
        DatabaseHelper.getConnection().sql("INSERT INTO ORDER ....");
        
    }
}