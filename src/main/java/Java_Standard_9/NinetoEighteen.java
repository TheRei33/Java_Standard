package Java_Standard_9;

public class NinetoEighteen {
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        String s  = sb.toString();
        String s2 = sb2.toString();

        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }

}
