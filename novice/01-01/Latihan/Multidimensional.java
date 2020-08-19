import java.util.Scanner;
public class Multidimensional 
{
    public static void main(String[] args) {
        int[][] cinema = {
            { 0, 0, 0, 0, 1 },
            { 0, 0, 0, 1, 1 },
            { 0, 0, 1, 1, 1 },
            { 0, 0, 0, 1, 1 },
            { 0, 0, 0, 0, 1 }
        };
        cinema[1][0] = 1;
        System.out.println(cinema[1][0]);
    }
}