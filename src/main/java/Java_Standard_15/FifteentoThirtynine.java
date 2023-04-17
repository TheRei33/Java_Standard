package Java_Standard_15;

public class FifteentoThirtynine implements java.io.Serializable {
    String name;
    String password;
    int age;

    public FifteentoThirtynine() {
        this("Unknown", "1111",0);
    }

    public FifteentoThirtynine(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString() {
        return "("+name+", " + password +", "+age+")";
    }
}
