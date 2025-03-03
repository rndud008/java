package annotation.java;

public class DeprecatedClass {
    public void call1(){
        System.out.println("DeprecatedCalss.call1");
    }

    @Deprecated // 더는 사용을 권장 하지 않는 요소
    public void call2(){
        System.out.println("DeprecatedCalss.call2");
    }

    @Deprecated(since = "2.4", forRemoval = true) // since 더이상 사용하지 않게된 버전 정보, forRemoval 미래버전에 코드가 제거될 예정.
    public void call3(){
        System.out.println("DeprecatedCalss.call3");
    }
}
