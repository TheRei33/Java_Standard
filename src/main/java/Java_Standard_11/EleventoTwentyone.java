package Java_Standard_11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EleventoTwentyone {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i = 0 ;  set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45)+1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);  // LinkedList(Collection c)
        Collections.sort(list);           // Collections.sort(List list)
        System.out.println(list);
    }

}
