package Java_Standard_2;

public class TwotoEleven {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n",f);
        System.out.printf("%X%n",i);
    }
}
