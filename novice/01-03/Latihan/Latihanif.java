
import java.util.Scanner;

public class Latihanif
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = Integer.parseInt(scanner.nextLine());
        if (age == 25) {
            System.out.println("Hey, I'm 25  too!"); // printed only when 25 is entered
        }
        System.out.println("Thanks for your age!"); // printed always
    }
}