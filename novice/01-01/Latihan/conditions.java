import java.util.Scanner;
public class  conditions 
{
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age:");
    int age = Integer.parseInt(scanner.nextLine());
    if (age <= 25) { 
            System.out.println("Hey, I'am below 25 too!"); //printed only when below 25 is entered
        }
        System.out.println("Thanks for your age!"); //printed always
    }
}