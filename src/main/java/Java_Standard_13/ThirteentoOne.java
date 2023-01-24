package Java_Standard_13;

public class ThirteentoOne {
    public static void main(String[] args) {
        ThreadEx_1 t1 = new ThreadEx_1();

        Runnable r = new ThreadEx_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadEx_1 extends Thread {
    public void run() {
        for(int i =0; i <5;i++)
            System.out.println(getName());
    }
}

class ThreadEx_2 implements Runnable {
    public void run() {
        for(int i=0; i <5;i++)
            System.out.println(Thread.currentThread().getName());
    }
}
