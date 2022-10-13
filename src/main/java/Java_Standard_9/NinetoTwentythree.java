package Java_Standard_9;

public class NinetoTwentythree {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i == i2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
        System.out.println("i.toString() = " + i.toString());

        System.out.println("MAX_VAULE = " + Integer.MAX_VALUE);
        System.out.println("MIN_VAULE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + " bits");
        System.out.println("BYTES = " + Integer.BYTES+ " bytes");
        System.out.println("TYPE = " + Integer.TYPE);
    }

}
