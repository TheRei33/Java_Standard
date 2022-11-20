package Java_Standard_10;

import java.text.*;

public class TentoSixteen {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"0", "C", "B", "A"};

        int[] scores = { 100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for(int i=0; i<scores.length; i++) {
            System.out.println(scores[i]+":"+form.format(scores[i]));
        }
    }
}
