package Java_Standard_6;

class Tv5 {
    String Color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

public class SixtoOne {
    public static void main(String[] args) {
        Tv5 tv ;
        tv = new Tv5();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("현재 채널은 "+tv.channel+"입니다.");
    }
}
