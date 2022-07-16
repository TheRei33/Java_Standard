package Java_Standard_6;

public class SixtoTwentyseven {
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public SixtoTwentyseven() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("SixtoTwentyseven ex = new SixtoTwentyseven();");
        SixtoTwentyseven ex = new SixtoTwentyseven();

        System.out.println("SixtoTwentyseven ex2 = new SixtoTwentyseven();");
        SixtoTwentyseven ex2 = new SixtoTwentyseven();
    }

}
