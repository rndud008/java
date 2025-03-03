package network.tcp.v2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV2 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");

        ServerSocket serverSocket = new ServerSocket(PORT);
        // 서버는 서버 소켓 이라는 특별한 소켓을 사용
        // 지정한 포트를 사용해서 서버 소켓을 생성하면 클라이언트는 해당 포트로 서버에 연결할수 잇음.
        // 이때 OS께층에서 TCP 3 way handshake 가 발생하고 TCP 연결 완료.

        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        Socket socket = serverSocket.accept();
        // 위 소켓을 통해 클라이언트와 연결
        // 서버 소켓은 단지 클라이어늩와 서버의 TCP 연결만 지원하는 특별한 소켓
        // accept() 를 호출하면 backlog queue 에서 TCP 연결 정보 조회
        // -> 만약 TCP 연결 정보가 없다면, 연결 정보가 생성될때 까지 대기.(블로킹)
        // 해당 정보 기반으로 socket 객체 생성
        // 사용한 TCP 연결 정보는 backlog queue에서 제거.
        log("소켓 연결: " + socket);

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        while (true){

            //클라이언트로부터 문자 받기
            String received = input.readUTF();
            log("client -> server: " + received);

            if (received.equals("exit")){
                break;
            }

            // 클라이언트에게 문자 보내기
            String toSend = received + " World";
            output.writeUTF(toSend);
            log("client <- server: " + toSend);

        }

        // 자원정리
        log("연결 종료: " + socket);
        input.close();
        output.close();
        socket.close();
        serverSocket.close();
    }
}
