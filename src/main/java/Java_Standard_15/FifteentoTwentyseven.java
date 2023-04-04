package Java_Standard_15;

import java.io.*;

public class FifteentoTwentyseven {
    public static void main(String[] args) {
        int sum = 0;

        try {
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
            int i =4;

            while(true) {
                raf.seek(i);
                sum += raf.readInt();
                i += 16;
            }
        } catch (EOFException eof) {
            System.out.println("sum: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
