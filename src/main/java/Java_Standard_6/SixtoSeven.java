package Java_Standard_6;

public class SixtoSeven {
    public static void main(String[] args) {
        firstMethod();
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}
