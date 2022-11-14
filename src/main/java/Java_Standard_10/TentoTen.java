package Java_Standard_10;

import java.text.DecimalFormat;
import java.util.Iterator;

public class TentoTen {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] parttern = {
                "0",
                "#",
                "0.0",
                "0000000000.0000",
                "##########.####",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "0000E0",
                "#.#E0",
                "0.0E0",
                "0.000000000E0",
                "00.00000000E0",
                "000.0000000E0",
                "#.#########E0",
                "##.########E0",
                "###.#######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #.###",
                "'#'#,###",
                "''#,###"
        };

        for(int i =0; i <parttern.length ; i++) {
            DecimalFormat df = new DecimalFormat(parttern[i]);
            System.out.printf("%19s : %s\n",parttern[i], df.format(number));
        }
    }
}
