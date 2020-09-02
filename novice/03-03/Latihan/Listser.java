import java.io.*;
public class Listser{
    public static void main(String[] args){
        File f = new File(args[0]);
        String[] list = f.list(new FilenameFilter() {
            public boolean accept(File f, String s){ 
                return s.endsWith(".java");
            }
        });
        for (int i=0; i < list.length; i++){
        System.out.println(list[i]);}
    }
}