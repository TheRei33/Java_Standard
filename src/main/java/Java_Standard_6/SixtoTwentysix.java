package Java_Standard_6;

class car {
    String color;
    String gearType;
    int door;

    car() {
        this("white", "auto", 4);
    }

    car(car c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class SixtoTwentysix {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car(c1);
        System.out.println("c1의 color = "+c1.color+", gearType = "+c1.gearType+", door = " +c1.door);
        System.out.println("c2의 color = "+c2.color+", gearType = "+c2.gearType+", door = " +c2.door);

        c1.door = 100;
        System.out.println("c1.door = 100; 생성후");
        System.out.println("c1의 color = "+c1.color+", gearType = "+c1.gearType+", door = " +c1.door);
        System.out.println("c2의 color = "+c2.color+", gearType = "+c2.gearType+", door = " +c2.door);
    }
}
