package Java_Standard_13;

public class ThirteentoNineteen {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx19_1 th1 = new ThreadEx19_1();
        ThreadEx19_2 th2 = new ThreadEx19_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {}

        System.out.print("소요시간: " + (System.currentTimeMillis() - ThirteentoNineteen.startTime));
    }
}


class ThreadEx19_1 extends Thread {
    public void run() {
        for(int i=0; i <300;i++) {
            System.out.print(new String("-"));
        }
    }
}

class ThreadEx19_2 extends Thread {
    public void run() {
        for(int i=0; i <300;i++) {
            System.out.print(new String("|"));
        }
    }
}
