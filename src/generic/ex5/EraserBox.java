package generic.ex5;

public class EraserBox <T>{
    public boolean instanceCheck(T param){
//        return param instanceof T; // 오류
//        return param instanceof Object; // 컴파일시 T는 Object 로 변환됨
        return false;
    }

    public void create(){
//        return new T(); // 오류
//        return new Object(); // 컴파일시 T는 Object 로 변환됨
    }
}
