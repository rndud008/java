package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
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

        int sum =0;
        for (Integer num : numbers){
            sum+= num;
        }

        double average = (double) sum / numbers.size();
        System.out.println();
        System.out.println("average = " + average);
        System.out.println("sum = " + sum);
    }
}
