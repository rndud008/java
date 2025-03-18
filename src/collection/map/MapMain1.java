package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String , Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA",90);
        studentMap.put("studentB",80);
        studentMap.put("studentC",80);
        studentMap.put("studentD",100);
        System.out.println("studentMap = " + studentMap);

        //studentMap = {studentB=80, studentA=90, studentD=100, studentC=80}

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        // result = 100

        System.out.println("keySet 활용");
        Set<String > keySet = studentMap.keySet();
        for (String key: keySet){
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);

//            key = studentB, value = 80
//            key = studentA, value = 90
//            key = studentD, value = 100
//            key = studentC, value = 80
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();

        for (Map.Entry<String, Integer> entry: entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);

//            key = studentB, value = 80
//            key = studentA, value = 90
//            key = studentD, value = 100
//            key = studentC, value = 80
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values){
            System.out.println("value = " + value);

//            value = 80
//            value = 90
//            value = 100
//            value = 80
        }

    }
}
