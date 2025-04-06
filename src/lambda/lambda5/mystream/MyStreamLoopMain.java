package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100)
                , new Student("Banana", 80)
                , new Student("Berry", 50)
                , new Student("Tomato", 40)
        );

        List<String> list = MyStreamV3.of(students).filter(s -> s.getScore() >= 80)
                .map(s -> s.getName()).toList();

        // 외부 반복
        for (String name: list){
            System.out.println("name = " + name);
        }

        // 추가
        MyStreamV3.of(students).filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .forEach(naem -> System.out.println("naem = " + naem)); // 내부 반복

    }


}
