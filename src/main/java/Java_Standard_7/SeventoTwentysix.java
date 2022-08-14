package Java_Standard_7;

public class SeventoTwentysix {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Dropship2 dropship = new Dropship2();

        Marine2 marine = new Marine2();
        SCV2 scv = new SCV2();
        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine);
    }
}

interface Repairable { }

class Unit2 {
    int hitPoint;
    final int MAX_HP;
    Unit2(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit2 extends Unit2 {

    GroundUnit2(int hp) {
        super(hp);
    }

}

class AirUnit2 extends Unit2 {

    AirUnit2(int hp) {
        super(hp);
    }

}

class Tank2 extends GroundUnit2 implements Repairable {

    Tank2() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship2 extends AirUnit2 implements Repairable {

    Dropship2() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }

}

class Marine2 extends GroundUnit2 {

    Marine2() {
        super(40);
        hitPoint = MAX_HP;
    }

}

class SCV2 extends GroundUnit2 implements Repairable {
    SCV2(){
        super(60);
        hitPoint = MAX_HP;
    }

    void repair (Repairable r) {
        if(r instanceof Unit2) {
            Unit2 u = (Unit2) r;
            while(u.hitPoint!=u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}
