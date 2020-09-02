package SingletonApp;
public class SingletonApp {
    public static void main(String[] args){
        OrderService orderService = new OrderService();
        orderService.save(orderid: "0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save( orderid: "0001" , product: "Indomie");
        orderDetailService.save( orderid: "0001" , product: "Sabun");
        orderDetailService.save( orderid: "0001" , product: "Pepsoden");
    }
}