import java.util.Scanner;
public class CekKelulusan {
    public static void main(String[] args) {
        // membuat variabel dan Scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner (System.in);

        // mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( nilai >= 70 ) {
            System.out.println("Selamat " + nama + ", anda LULUS!");
        } else {
            System.out.println("Maaf " + nama + ", anda GAGAL");
        }
    }
}