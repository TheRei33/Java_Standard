package Java_Standard_6;

class Car1{
    String color;
    String gearType;
    int door;

    Car1() {
        this("white", "auto", 4);
    }

    Car1(String color){
        this(color, "auto", 4);
    }

    Car1(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class SixtoTwentyfive {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        Car1 c2 = new Car1("blue");

        System.out.println("c1의 color = "+c1.color+", gearType = "+c1.gearType+", door = " +c1.door);
        System.out.println("c2의 color = "+c2.color+", gearType = "+c2.gearType+", door = " +c2.door);
    }

}
