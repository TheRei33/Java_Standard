package Java_Standard_11;

import java.util.Iterator;
import java.util.Vector;

public class EleventoSeventeen {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");

        System.out.println("삭제 전 : "+v);
        Iterator it = v.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();

        System.out.println("삭제 후 : "+v);
    }
}
