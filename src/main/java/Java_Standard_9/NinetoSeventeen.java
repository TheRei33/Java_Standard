package Java_Standard_9;

public class NinetoSeventeen {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        int index = fullName.indexOf('.');

        String fileName = fullName.substring(0, index);

        String ext = fullName.substring(index+1, fullName.length());

        System.out.println(fullName + "의 확장자의 제외한 이름은 "+ fileName);
        System.out.println(fullName + "의 확장자는 "+ext);
    }
}
