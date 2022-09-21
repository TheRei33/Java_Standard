package Java_Standard_9;

class Person {
    long id;

    public boolean equals(Object obj) {
        if(obj instanceof Person)
            return id ==((Person)obj).id;
        else
            return false;

    }

    Person(long id) {
        this.id = id;
    }
}

public class NinetoTwo {
    public static void main(String[] args) {
        Person p1 = new Person(801108111122L);
        Person p2 = new Person(801108111122L);

        if(p1 == p2)
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

        if(p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");
    }
}
