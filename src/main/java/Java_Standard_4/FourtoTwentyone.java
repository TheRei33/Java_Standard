package Java_Standard_4;

public class FourtoTwentyone {
    public static void main(String[] args) {
        for( int i = 1 ; i <= 5 ; i++) {
            for( int j = 1 ; j <= 5 ; j++) {
                if(i==j) {
                    System.out.printf("[%d,%d]", i, j);
                }else {
                    System.out.printf("%5c",' ');
                }
            }  // for
            System.out.println();
        }
    }
}
