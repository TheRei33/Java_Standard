package Java_Standard_6;

public class SixtoTwenty {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //    static int cv2 = iv;
    static int cv2 = new SixtoTwenty().iv;

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);
        SixtoTwenty ex = new SixtoTwenty();
        System.out.println(ex.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();
        SixtoTwenty ex = new SixtoTwenty();
        ex.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
