package Java_Standard_15;

import java.io.*;

public class FifteentoTwentyfour {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos =  new FileOutputStream("text.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        System.out.println("Hello by System.out");
        System.out.println("Hello by System.err");
    }
}
