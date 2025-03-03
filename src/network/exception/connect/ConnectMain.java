package network.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConnectMain {

    public static void main(String[] args) throws IOException {

        unknownHostEx1();
        unknownHostEx2();
        connectionRefuesed();

    }

    private static void unknownHostEx1() throws IOException {

        try {
            Socket socket = new Socket("999.999.999.999", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            // 호스트를 알수 없음.
        }

    }


    private static void unknownHostEx2() throws IOException {

        try {
            Socket socket = new Socket("google.gogo", 80);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    private static void connectionRefuesed() throws IOException {
        try {
            Socket so = new Socket("localhost", 45678);
        } catch (ConnectException e) {
            e.printStackTrace();
            // 연결을 시도 하는데 대상은 잇음
            // 하지만 포트번호가 열려 있지 않기때문에 exception 발생.
        }
    }

}
