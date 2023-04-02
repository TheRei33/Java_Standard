package Java_Standard_15;

import java.io.*;

public class FifteentoTwentyfive {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
            System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
            raf.writeInt(100);
            System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
            raf.writeLong(100L);
            System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
