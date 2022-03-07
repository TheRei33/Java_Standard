package Java_Standard_2;

public class TwotoTwo {
    public static void main(String[] args) {
        int x1 =10,y1=20;
        int tmp1 = 0;

        System.out.println("X: "+x1+"Y: "+y1);

        tmp1 =x1;
        x1=y1;
        y1=tmp1;
        System.out.println("X: "+x1+"Y: "+y1);
    }
}
