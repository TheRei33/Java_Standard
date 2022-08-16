package Java_Standard_7;

class A2 {
    void autoPlay(I2 i) {
        i.play();
    }
}

interface I2 {
    public abstract void play();
}

class B2 implements I2 {
    public void play() {
        System.out.println("play in B2 class");
    }
}

class C2 implements I2 {
    public void play() {
        System.out.println("play in C2 class");
    }
}

public class SeventoTwentyeight {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());
        a.autoPlay(new C2());
    }
}
