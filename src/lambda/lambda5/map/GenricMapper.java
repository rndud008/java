package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GenricMapper {
    public static<T,R> List<R> map(List<T> list, Function<T,R> mapper) {
        List<R> result = new ArrayList<>();
        for(T str : list){
            result.add(mapper.apply(str));
        }
        return result;
    }
}
