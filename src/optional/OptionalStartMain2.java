package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain2 {
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
        Optional<String> optName = findNameById(id);
        String name = optName.orElse("UNKNOWN");
        System.out.println(id + " : " +name.toUpperCase());

    }

    static Optional<String> findNameById(Long id){
        String findName = map.get(id);
        Optional<String> optName = Optional.ofNullable(findName);
        return optName;
    }
}
