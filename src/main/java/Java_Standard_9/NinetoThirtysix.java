package Java_Standard_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NinetoThirtysix {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data2.txt"));
        int sum = 0;
        int cnt = 0;

        while(sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + (double) sum/cnt);
    }

}
