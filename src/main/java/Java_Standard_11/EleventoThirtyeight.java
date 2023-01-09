package Java_Standard_11;

import java.util.Properties;

public class EleventoThirtyeight {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version : "+
                sysProp.getProperty("java.version"));
        System.out.println("java.language : "+
                sysProp.getProperty("java.language"));
        sysProp.list(System.out);
    }
}
