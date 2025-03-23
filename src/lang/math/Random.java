package lang.math;

public class Random {
    public static void main(String[] args) {
//        java.util.Random random = new java.util.Random(1); // seed가 같으면 Random의 결과가 같다.
        java.util.Random random = new java.util.Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);// 0~ 9 출력
        System.out.println("0~9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1 ~ 10 출력
        System.out.println("1~10: " + randomRange2);

    }
}
