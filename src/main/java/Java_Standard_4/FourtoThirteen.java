package Java_Standard_4;

public class FourtoThirteen {
    public static void main(String[] args) {
        int sum = 0 ;

        for( int i = 1 ; i <= 10 ; i++) {
            sum += i ;
            System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
        }
    }
}
