package network.exception.close.normal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class NormalCloseServer {

    // 정상종료
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(12345);

        Socket socket = serverSocket.accept();
        log("소켓연결: " +socket);

        Thread.sleep(1000);
        socket.close();
        log("소켓 종료 " + socket);

    }
}
