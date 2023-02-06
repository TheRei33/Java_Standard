package Java_Standard_13;

import javax.swing.*;

public class ThirteentoFourteen {
    public static void main(String[] args) {
        ThreadEx14_1 th = new ThreadEx14_1();
        th.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 "+input+ "입니다.");
        th.interrupt();
        System.out.println("isInterrupted():"+th.isInterrupted());
    }
}

class ThreadEx14_1 extends Thread {
    public void run() {
        int i =10;

        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.println("카운터가 종료되었습니다.");
    }
}
