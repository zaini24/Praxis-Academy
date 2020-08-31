import java.util.Scanner;
public class Array2 {
    public static void main(String[] agrs) {
        int[] numbers = {2, 3, 5, 7};
        numbers[0] = 1;
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
    }
}