package Java_Standard_7;

public class SeventoSeventeen {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }

        if(fe instanceof Car) {
            System.out.println("This is a Car instance.");
        }

        if(fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }

        System.out.println(fe.getClass().getName());
    }
}

class Car{
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car{
    void water() {
        System.out.println("water!!!");
    }
}
