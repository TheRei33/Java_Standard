package Java_Standard_11;

import java.util.Set;
import java.util.TreeSet;

public class EleventoTwentysix {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i = 0 ; set.size() < 6; i++ ) {
            int num = (int)(Math.random()*45)+1;
            set.add(num);  // set.add(new Integer(num));
        }

        System.out.println(set);
    }
}
