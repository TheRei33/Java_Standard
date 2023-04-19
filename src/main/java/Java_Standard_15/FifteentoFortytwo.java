package Java_Standard_15;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class SuperUserInfo {
    String name;
    String password;

    SuperUserInfo() {
        this("Unknown","1111");
    }

    SuperUserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class FifteentoFortytwo extends SuperUserInfo implements java.io.Serializable {
    int age;

    public FifteentoFortytwo() {
        this("Unknown","1111",0);
    }

    public FifteentoFortytwo(String name, String password, int age) {
        super(name, password);
        this.age = age;
    }

    public String toString() {
        return "("+name+", "+password+", "+age+")";
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(null);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        password = in.readUTF();
        in.defaultReadObject();
    }
}
