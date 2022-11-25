package Java_Standard_10;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class TentoTwentyone {
    public static void main(String[] args) throws Exception {
        String tableName ="CUST_INFO";
        String fileName= "date4.txt";
        String msg = "INSERT INTO "+ tableName + "VALUES ({0},{1},{2},{3});";

        Scanner s = new Scanner(new File(fileName));

        String pattern ="{0},{1},{2},{3}";

        MessageFormat mf = new MessageFormat(pattern);

        while(s.hasNextLine()) {
            String line = s.nextLine();
            Object[] objs = mf.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        }

        s.close();
    }
}
