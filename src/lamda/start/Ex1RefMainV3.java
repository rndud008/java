package lamda.start;

import lamda.Procedure;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Procedure procedure){
        long startNs = System.nanoTime();

        // 코드 조각 시작
       procedure.run();
        //코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs-startNs) +"ns");
    }

    public static class Dice implements Procedure{

        @Override
        public void run() {
            // 코드 조각 시작
            int randomValue = new Random().nextInt(6)+1;
            System.out.println("randomValue = " + randomValue);
            //코드 조각 종료
        }
    }

    public static class Sum implements Procedure{

        @Override
        public void run() {
            // 코드 조각 시작
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
            //코드 조각 종료
        }
    }
    public static void helloDice(){
        long startNs = System.nanoTime();

        // 코드 조각 시작
        int randomValue = new Random().nextInt(6)+1;
        System.out.println("randomValue = " + randomValue);
        //코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs-startNs) +"ns");
    }

    public static void helloSum(){
        long startNs = System.nanoTime();

        // 코드 조각 시작
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        //코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs-startNs) +"ns");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();

        hello(new Sum());
        hello(new Dice());

        Procedure dice = new Procedure() {
            @Override
            public void run() {
                // 코드 조각 시작
                int randomValue = new Random().nextInt(6)+1;
                System.out.println("randomValue = " + randomValue);
                //코드 조각 종료
            }
        };

        Procedure sum = new Procedure() {
            @Override
            public void run() {
                // 코드 조각 시작
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
                //코드 조각 종료
            }
        };

        hello(dice);
        hello(sum);

        hello(new Procedure() {
            @Override
            public void run() {
                // 코드 조각 시작
                int randomValue = new Random().nextInt(6)+1;
                System.out.println("randomValue = " + randomValue);
                //코드 조각 종료
            }
        });
        hello(new Procedure() {
            @Override
            public void run() {
                // 코드 조각 시작
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
                //코드 조각 종료
            }
        });

    }
}
