package Java_Standard_5;

public class FivetoSeventeen {
    public static void main(String[] args) {
        if(args.length  != 3) {
            System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch(op) {
            case '+':
                result = num1 + num2 ;
                break;
            case '-':
                result = num1 - num2 ;
                break;
            case 'x':
                result = num1 * num2 ;
                break;
            case '/':
                result = num1 / num2 ;
                break;
            default :
                System.out.println("吏��썝�릺吏� �븡�뒗 �뿰�궛�엯�땲�떎.");
        }  // switch
        System.out.println("寃곌낵 : "+result);
    }
}
