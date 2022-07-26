package Java_Standard_7;

public class SeventoSeven {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class point {
    int x, y;

    point(int x, int y){
        this.x = x;
        this.y = y;
    }

    point() {
    }

    String getLocation() {
        return"x : "+ x + ", y : " + y;
    }
}

class Point3D extends point {
    int z;

    Point3D(int x, int y, int z){


        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return"x : "+ x + ", y : " + y + ", z : "+z;
    }
}