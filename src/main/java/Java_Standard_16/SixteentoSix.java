package Java_Standard_16;

import java.io.*;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

public class SixteentoSix {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try{
            //1. 서버 소켓을 생성한다.
            serverSocket = new ServerSocket(7777);
        }catch(IOException e) { e.printStackTrace(); }
        while(true){
            try{
                //2.서버 소켓이 연결요청을 처리할 수 있도록 대기상태로 만든다.
                //클라이언트 프로그램의 연결요청이 오면 새로운 소켓을 생성해서 클라이언트 프로그램의 소켓과 연결한다.
                Socket socket = serverSocket.accept();
                //4. 소켓의 출력스트림을 얻는다.
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);
                //5. 출력스트림을 이용해 데이터를 전송한다.
                dos.writeUTF("Message from Server");
                //7.출력스트림을 닫는다.
                dos.close();
                //8.소켓을 닫는다.
                socket.close();
            } catch(IOException e) { e.printStackTrace(); }
        }

//클라이언트 프로그램
        try{
            //3. 클라이언트 프로그램에서 소켓을 생성하여 서버 소켓에 연결을 한다.
            Socket socket = new Socket("127.0.0.1", 7777);
            //4. 소켓의 입력스트림을 얻는다.
            InputStream in = Socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            //6. 입력스트림을 이용해 데이터를 얻는다.
            String result = dis.readUTF();
            //7. 입력스트림을 닫는다.
            dis.close();
            //8.소켓을 닫는다.
            socket.close();
        } catch(ConnectException ce) {
            ce.printStackTrace();
        } catch(IOException ie){
            ie.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
