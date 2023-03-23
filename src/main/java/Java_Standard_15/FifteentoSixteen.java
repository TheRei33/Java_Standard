package Java_Standard_15;

import java.io.*;

public class FifteentoSixteen {
    public static void main(String[] args) {
        try {
            String fileName = "text.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;
            while((data=fis.read()) != -1) {
                System.out.print((char)data);
            }
            System.out.println();
            fis.close();

            while((data=fr.read()) != -1)
                System.out.print((char)data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
