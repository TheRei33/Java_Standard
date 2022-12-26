package Java_Standard_11;

import java.util.HashSet;

public class EleventoTwentyfour {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person2("David",10));
        set.add(new Person2("David",10));

        System.out.println(set);
    }
}

class Person2{
    String name;
    int age;

    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals (Object obj) {
        if(obj instanceof Person2) {
            Person2 tmp = (Person2)obj;
            return name.equals(tmp.name) && age == tmp.age;
        }
        return false;
    }

    public int hashCode() {
        return (name+age).hashCode();
    }

    @Override
    public String toString() {
        return name + ":"+age;
    }
}
