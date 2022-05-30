package Java_Standard_5;

public class FivetoThree {
    public static void main(String[] args) {
        int[] arr = new int[5] ;

        for( int i = 0 ; i < 5 ; i++)
            arr[i] = i + 1 ;

        System.out.println("[before]");
        System.out.println("arr.length : "+arr.length);
        for( int i = 0 ; i < arr.length ; i++)
            System.out.println("arr [" + i + "] : "+arr[i] );

        int[] tmp = new int [arr.length * 2];

        for( int i = 0 ; i < arr.length ; i++)
            tmp[i] = arr[i] ;

        arr = tmp ;

        System.out.println("[after]");
        System.out.println("arr.length : "+arr.length);
        for( int i = 0 ; i < arr.length ; i++)
            System.out.println("arr [" + i + "] : "+arr[i] );
    }
}
