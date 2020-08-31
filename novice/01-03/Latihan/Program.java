import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = Integer.parseInt(scanner.nextLine());
        if (age == 25) {
            System.out.println("Hey, I'm 25 too!"); // printed only 25 entered
            System.out.println("Nice to meet you!"); // printed only when 25 is entered
        }
        else {
            System.out.println("Nice to meet you, I'm 25!"); // printed for any other age
        }
        System.out.println("Thanks for your age!"); // printed always
    }
}