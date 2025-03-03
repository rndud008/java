package annotation.java;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningCase {

    @SuppressWarnings("unused")
    public void unusedWarning(){
        // 사용 되지 않는 변수 경고 억제
        int unusedVariable= 10;
    }

    @SuppressWarnings("deprecation")
    public void deprecatedMethod(){
        // 사용이 권장되지 않는 코드 경고 deprecation 억제
        java.util.Date date= new java.util.Date();
        int date1 = date.getDate();
    }

    @SuppressWarnings({"rawtypes","unchecked"})
    public void uncheckedCast(){
        // 제네릭 타입 캐스팅 경고 억제, raw type 사용 경고
        List list = new ArrayList<>();

        // 제네릭 타입과 관련된 unchecked 경고
        List<String> stringList = (List<String>)list;
    }

    @SuppressWarnings("all")
    public void suppressAllWarning(){
        // 모든 경고 억제

        java.util.Date date= new java.util.Date();
        int date1 = date.getDate();

        List list = new ArrayList<>();
        List<String> stringList = (List<String>)list;
    }
}
