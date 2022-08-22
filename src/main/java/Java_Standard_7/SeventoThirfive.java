package Java_Standard_7;

class Outer2 {
    int value = 10;

    class Inner {
        int vaule = 20;

        void method2() {
            int value = 30;
            System.out.println("value : " + value);
            System.out.println("this.value : " + this.vaule);
            System.out.println("Outer2.this.value : " + Outer2.this.value);
        }
    }
}

public class SeventoThirfive {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.method2();
    }
}
