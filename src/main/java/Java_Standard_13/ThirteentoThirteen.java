package Java_Standard_13;

import javax.swing.JOptionPane;

public class ThirteentoThirteen {
    public static void main(String[] args) throws Exception {
        ThreadEx13_1 th = new ThreadEx13_1();
        th.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 "+input+"입니다.");
        th.interrupt();
        System.out.println("isInterrupted(): " + th.isInterrupted());
    }
}

class ThreadEx13_1 extends Thread {
    public void run() {
        int i =10;

        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x =0;x<2500000000L;x++);
        }

        System.out.println("카운터가 종료되었습니다.");
    }
}
