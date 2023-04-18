package Java_Standard_15;

import java.io.*;
import java.util.ArrayList;

public class FifteentoFortyone {
    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.ser";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            ObjectInputStream in = new ObjectInputStream(bis);

            UserInfo u1 = (UserInfo)in.readObject();
            UserInfo u2 = (UserInfo)in.readObject();
            ArrayList list = (ArrayList)in.readObject();

            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
