package Java_Stardard_14;

@FunctionalInterface
interface MyFunction {
    void myMethod();
}

public class FourteentoTwo {
    public static void main(String[] args) {
        MyFunction f = ()->{};
        Object obj = (MyFunction)(()->{});
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(()->{});
        System.out.println((MyFunction)(()->{}));
//        System.out.println((MyFunction)(()->{}).toString());
        System.out.println(((Object)(MyFunction)(()->{})).toString());

    }
}
