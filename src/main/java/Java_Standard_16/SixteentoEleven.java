package Java_Standard_16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SixteentoEleven {
    public static void main(String[] args) {

    }

    class Sender extends Thread {
        Socket socket;
        DataOutputStream out;
        String name;

        Sender(Socket socket) {
            this.socket = socket;
            try {
                out = new DataOutputStream(socket.getOutputStream());
                name = "[" + socket.getInetAddress() + " : " + socket.getPort() + "]";
            } catch (Exception e) {}
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            while(out != null) {
                try{
                    out.writeUTF(name + scanner.nextLine());
                } catch (IOException e) {}
            }
        } // run
    }

    class Receiver extends Thread {
        Socket socket;
        DataInputStream in;

        Receiver(Socket socket) {
            this.socket = socket;
            try{
                in = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {}
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            while(in != null) {
                try{
                    System.out.println(in.readUTF());
                } catch (IOException e) {}
            }
        }
    }
}
