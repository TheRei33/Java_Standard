package Java_Standard_4;

import java.util.Scanner;

public class FourtoSeventeen {
    public static void main(String[] args) {
        int num = 0 ;

        System.out.println("*을 출력할 라인의 수를 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        for( int i = 0 ; i <= num ; i++) {
            for( int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
