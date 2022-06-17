package Java_Standard_5;

import java.util.Scanner;

public class FivetoTwentyone {
    public static void main(String[] args) {
        final int SIZE = 5 ;
        int x = 0, y = 0, num = 0 ;

        int[][] bingo = new int[SIZE][SIZE] ;
        Scanner sc = new Scanner(System.in) ;

        for( int i = 0 ; i < SIZE ; i++ ) {
            for (int j = 0 ; j < SIZE ; j++ ) {
                bingo[i][j] = i * SIZE + j + 1 ;
            }
        }  // for( i )

        for( int i = 0 ; i < SIZE ; i++ ) {
            for (int j = 0 ; j < SIZE ; j++ ) {
                x = ( int )( Math.random() * SIZE ) ;
                y = ( int )( Math.random() * SIZE ) ;

                int tmp = bingo[i][j] ;
                bingo[i][j] = bingo[x][y] ;
                bingo[x][y]    = tmp ;
            }
        }  // for( i )

        do {
            for( int i = 0 ; i < SIZE ; i++ ) {
                for (int j = 0 ; j < SIZE ; j++ ) {
                    System.out.printf("%2d",bingo[i][j]);
                }
                System.out.println();
            }  // for( i )
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE*SIZE);
            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            outer:
            for( int i = 0 ; i < SIZE ; i++ ) {
                for (int j = 0 ; j < SIZE ; j++ ) {
                    if(bingo[i][j]==num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }  // for( i )
        } while (num != 0);

    }  // main
}
