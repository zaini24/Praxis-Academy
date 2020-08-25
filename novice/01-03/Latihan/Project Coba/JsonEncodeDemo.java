package zaini;

import java.util.HashMap;
import com.google.gson.Gson;

public class JsonEncodeDemo {

    private final Gson serializer = new Gson();
    
    public static void main(String[] args){
        new JsonEncodeDemo().mulai();
    }
    public void mulai() {
        HashMap<String, Object> data = new HashMap<>();

        data.put("name","foo");
        data.put("num", 100);
        data.put("balance", 1000.21);
        data.put("is_vip", true);

        String json = this.serializer.toJson(data);
        System.out.print(json);
    }
}