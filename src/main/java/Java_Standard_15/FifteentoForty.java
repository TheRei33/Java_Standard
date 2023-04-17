package Java_Standard_15;

import java.io.*;
import java.util.ArrayList;

public class FifteentoForty {
    public static void main(String[] args) {
        try {
            String fileName = "FifteentoThirtynine.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            FifteentoThirtynine u1 = new FifteentoThirtynine("JavaMan","1234",30);
            FifteentoThirtynine u2 = new FifteentoThirtynine("JavaWoman","4321",26);

            ArrayList<FifteentoThirtynine> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화가 잘 끝났습니다.");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
