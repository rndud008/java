package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.println("n 개의 정수를 넣으세요 종료(0)");
        while (true){
            int input = sc.nextInt();
            if (input == 0){
                break;
            }
            numbers.add(input);
        }
        System.out.println("출력");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() -1){
                System.out.print(", ");
            }
        }
    }
}
