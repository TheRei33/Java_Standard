package Java_Standard_5;

public class FivetoSix {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 } ;

        int max = score[0] ;
        int min = score[0] ;

        for( int i = 1 ; i < score.length ; i++ ) {
            if( score[i] > max ) {
                max = score[i] ;
            }else if( score[i] < min ){
                min = score[i] ;
            }
        }  // for

        System.out.println("max : " + max);
        System.out.println("min : " + min);

    } // main
}
