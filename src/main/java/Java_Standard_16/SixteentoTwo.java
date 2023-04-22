package Java_Standard_16;

import java.net.*;

public class SixteentoTwo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.codechobo.com:80/simple/" + "hello.html?referer=codechobo#index1");

        System.out.println("url.getAuthority(): " + url.getAuthority());
        System.out.println("url.getContent(): " + url.getContent());
        System.out.println("url.getDefaulPort(): " + url.getDefaultPort());
        System.out.println("url.getPort(): " + url.getPort());
        System.out.println("url.getFile(): " + url.getFile());
        System.out.println("url.getHost(): " + url.getHost());
        System.out.println("url.getPath(): " + url.getPath());
        System.out.println("url.getProtocaol(): " + url.getProtocol());
        System.out.println("url.getQuery(): " + url.getQuery());
        System.out.println("url.getRef(): " + url.getRef());
        System.out.println("url.getUserInfo(): " + url.getUserInfo());
        System.out.println("url.toExternalForm(): " + url.toExternalForm());
        System.out.println("url.toURI(): " + url.toURI());

    }
}
