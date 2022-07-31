package Java_Standard_7;

class Card_01 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card_01(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card_01() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + "" + NUMBER;
    }
}

public class SeventoTwenty {
    public static void main(String[] args) {
        Card_01 c = new Card_01("HEART", 10);
//        c.NUMBER = 5;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
