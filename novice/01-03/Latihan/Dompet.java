import java.util.ArrayList;
public class Dompet {
    public static void main(String[] args){
        
        // membuat objek array list
        ArrayList kantongPenuh = new ArrayList();

        // mengisi kantong penuh dengan 5 benda
        kantongPenuh.add("Duit halal");
        kantongPenuh.add(123);
        kantongPenuh.add("Tuyul");
        kantongPenuh.add(3213210.123);
        kantongPenuh.add(true);

        // menghapus tuyul dari kantong penuh
        kantongPenuh.remove("Tuyul");

        // menampilkan isi kantong penuh
        System.out.println(kantongPenuh);

        // menampilkan banyak isi kantong penuh
        System.out.println("Kantong penuh berisi "+ kantongPenuh.size() +" item");
    }
}