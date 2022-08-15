package Java_Standard_7;

class A {
    public void methodA( B b) {
        b.methodB();
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

public class SevenetoTwentyseven {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
