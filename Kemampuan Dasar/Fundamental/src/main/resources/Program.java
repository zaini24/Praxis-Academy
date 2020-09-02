

import java.util.Arrays;
import java.util.Scanner;

public class Program {

public static void main(String[] args) {

String[] simpsons = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
Arrays.sort(simpsons); // sort the array
System.out.printf("Bart is at the position: %s\n", Arrays.binarySearch(simpsons, "Bart")); // gets the item index
String[] copy = new String[5];
copy = Array.copyOfRange(simpsons, 0, 4); // copies 5 items to the "copy" array
for (String s : simpsons) {
    System.out.printf("%s ", s);
}

}
}
