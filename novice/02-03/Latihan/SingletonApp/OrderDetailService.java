package SingletonApp;
public class OrderDetailService {
    public void save(String orderId, String product){
        
        DatabaseHelper.getConnection().sql("INSERT INTO ORDER_DETAILS....");
    }
}