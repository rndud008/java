package network.exception.close.reset;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import static util.MyLogger.log;

public class ResetCloseClient {
    public static void main(String[] args) throws InterruptedException, IOException {

        // 기본적으로 IOException 이 발생하면 자원을 모두 정리함녀 되나
        // 상세하게 IOException 중 자식Exception 을 다르게 처리해야할경우 예외를 다르게 처리하면됨.
        Socket socket =  new Socket("localhost", 12345);
        log("소켓 연결: " + socket);

        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        // 자기 자신의 소켓을 먼저 닫은 후 아래 코드인 read , write 를 사용할경우
        // java.net.SocketException: Socket is closed 발생.
//        input.close();
//        output.close();
//        socket.close();

        // client < - server : FIN
        Thread.sleep(1000);

        // client -> server : PUSH[1]
        output.write(1);

        // client <- server: RST
        Thread.sleep(1000);

        try {
            // java.net.SocketException: 현재 연결은 사용자의 호스트 시스템의 소프트웨어의 의해 중단되었습니다 ??
            // java.net.SocketException: Connection reset
            // Reset은 현재의 세션을 강제로 종료하고 연결을 무효화 하라는 뜻.
        int read = input.read();
            System.out.println("read = " + read);
        }catch (SocketException e){
            e.printStackTrace();
        }

        try {
            // java.net.SocketException: 현재 연결은 사용자의 호스트 시스템의 소프트웨어의 의해 중단되었습니다 ??
            // java.net.SocketException: Broken pipe
            output.write(1);
        }catch (SocketException e){
            e.printStackTrace();
        }

    }
}
