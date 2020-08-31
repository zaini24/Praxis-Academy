import java.util.Scanner;
public class SplitJo{
    public static void main(String[] args){
        String text = "I like Java" ;
        String [] words = text.split(" "); // split the text by spaces 
        System.out.println(words[2]); // print the third word
        words [1] = "Mantulz"; // change the second word
        text = String.join(" ", words); // join it back to the text
        System.out.println(text);
    }
}