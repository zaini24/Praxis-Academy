import java.util.Scanner;
public class Array3 {
    public static void main(String[] args){
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++){
            numbers [i] = i + 1;}
            for (int i : numbers) {
                System.out.printf("%d ", i);
        }
    }
}