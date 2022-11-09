package Java_Standard_10;

import java.util.*;

public class TentoFive {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();

        date.set(2015, 1, 31);
        System.out.println(toString(date));
        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "+ date.get(Calendar.MONTH)+"월 "+date.get(Calendar.DATE)+"일 ";
    }
}
