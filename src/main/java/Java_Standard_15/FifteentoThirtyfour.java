package Java_Standard_15;

import java.io.*;

public class FifteentoThirtyfour {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("USAGE : java jsp15_34 pattern");
            System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        final String pattern = args[0];

        String[] files = dir.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.indexOf(pattern) != -1;
            }
        });

        for(int i =0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
