package Java_Standard_7;

public class SeventoThirtwo {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        SeventoThirtwo outer = new SeventoThirtwo();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

//        LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
