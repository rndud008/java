package exception.ex4;


import exception.ex4.excepiton.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();


        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")){
                break;
            }
            try {
            networkService.sendMessage(input);

            }catch (Exception e){
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다.");
    }

    //  공토 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다");
        System.out.println("개발자용 디버깅 메시지");
        e.printStackTrace(System.out);// 스택트레이스 출력(표준 출력)
//        e.printStackTrace();// 일반적 사용방법

        // 필요시 예외 별도 처리 가능.
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터:" + sendEx.getSendData());
        }
    }
}
