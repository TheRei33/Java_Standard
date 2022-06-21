package Java_Standard_6;

class TV{
    String Color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }

}

public class SixtoTwo {
    public static void main(String[] args) {
        TV t1 = new TV();
        TV t2 = new TV();
        System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+"입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값은 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+"입니다.");
    }
}
