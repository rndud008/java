package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","orange");

        List<String> upperFruits = GenricMapper.map(fruits, value -> value.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);

        // String -> Integer
        List<Integer> lengthFruits = GenricMapper.map(fruits, value -> value.length());
        System.out.println("lengthFruits = " + lengthFruits);

        //Integer -> String
        List<Integer> integers = List.of(1,2,3);
        List<String> starList = GenricMapper.map(integers,n -> "*".repeat(n));
        System.out.println("starList = " + starList);
    }


}
