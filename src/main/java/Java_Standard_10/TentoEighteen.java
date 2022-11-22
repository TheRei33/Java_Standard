package Java_Standard_10;

import java.text.MessageFormat;

public class TentoEighteen {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthdat:{3}";

        Object[] arguments = {
                "이자바", "02-123-1234","27","07-09"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
