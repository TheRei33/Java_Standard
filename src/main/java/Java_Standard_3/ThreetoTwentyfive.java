package Java_Standard_3;

import java.util.Scanner;

public class ThreetoTwentyfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ' ;

        System.out.println("문자를 하나 입력하세요.>");

        String input = sc.nextLine();
        ch = input.charAt(0);

        if('0' <= ch && ch <= '9') {
            System.out.printf("입력하시 문자는 숫자입니다.%n");
        }
        if('a' <= ch && ch <= 'z') {
            System.out.printf("입력하시 문자는 영문자입니다.%n");
        }

    }
}
