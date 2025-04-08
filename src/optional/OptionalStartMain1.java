package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OptionalStartMain1 {
    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1l,"Kim");
        map.put(2l,"Seo");
    }

    public static void main(String[] args) {
        findAndPrint(1l); // 값이 있는경우
        findAndPrint(3l); // 값이 없는경우

    }

    // 이름이 있으면 이름을 대문자로 출력, 없으면 "UNKNOWN"을 출력해라
    static void findAndPrint(Long id){
        String name = findNameById(id);
        // 1. NullPointerException: Cannot invoke "String.toUpperCase()" because "name" is null
//        System.out.println("name = " + name.toUpperCase());

        // 2. if 문을 활용한 null 체크 필요
        if (name != null){
            System.out.println(id + " : " +name.toUpperCase());

        }else {
            System.out.println(id + " : " + "UNKNOWN");
        }

    }

    static String findNameById(Long id){
        return map.get(id);
    }
}
