package Java_Standard_2;

public class TwotoTwo {
    public static void main(String[] args) {
        int x =10,y=20;
        int tmp = 0;

        System.out.println("X: "+x+"Y: "+y);

        tmp =x;
        x=y;
        y=tmp;
        System.out.println("X: "+x+"Y: "+y);
    }
}
