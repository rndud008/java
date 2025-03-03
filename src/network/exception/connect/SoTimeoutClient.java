package network.exception.connect;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SoTimeoutClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        InputStream input = socket.getInputStream();

        try {
            socket.setSoTimeout(3000); // 타임아웃 시간 설정.
            int read = input.read();
            System.out.println("read = " + read);
        }catch (Exception e){
            e.printStackTrace();
        }
        // 네트워크 연결시 안될수도 있는점 도 생각하여 타임아웃을 설정하여 스레드 관리.?

        socket.close();

    }
}
