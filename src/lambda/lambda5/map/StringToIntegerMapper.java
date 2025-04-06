package lambda.lambda5.map;

import nested.test.ex1.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringToIntegerMapper {
    public static List<Integer> map(List<String> list, Function<String,Integer> mapper) {
        List<Integer> result = new ArrayList<>();
        for(String str : list){
            result.add(mapper.apply(str));
        }
        return result;
    }
}
