package Java_Standard_16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class SixteentoThirteen {
    HashMap clients;

    SixteentoThirteen(){
        clients = new HashMap();
        Collections.synchronizedMap(clients); // 동기화: 쓰레드 동시 접근 불가
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 시작되었습니다.");

            while(true) {
                socket = serverSocket.accept();
                System.out.println("[" + socket.getInetAddress() +":"+socket.getPort()+"]" + "에서 접속하였습니다.");
//                ServerRece

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // start

    void sendToAll(String msg) {
        Iterator it = clients.entrySet().iterator();

        while(it.hasNext()) {
            try {
                DataOutputStream out = (DataOutputStream) clients.get(it.next());
                out.writeUTF(msg);
            } catch (IOException e) {}
        }
    } // sendToAll

    public static void main(String[] args) {
        new SixteentoThirteen().start();
    }

    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        ServerReceiver(Socket socket) {
            this.socket = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {}
        }

        public void run() {
            String name = "";

            try {
                name = in.readUTF();
                sendToAll("#" + name +"님이 들어오셨습니다.");

                clients.put(name, out);
                System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
            } catch (IOException ie) {

            } finally {
                sendToAll("#"+ name +"님이 나가셨습니다.");
                clients.remove(name);
                System.out.println("[" + socket.getInetAddress() +"]" + "에서 접속을 종료하였습니다.");
                System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");
            }
        }
    }
}
