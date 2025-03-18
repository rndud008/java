package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("== 단어 입력 단계 ==");
        while (true){
            System.out.println("연어 단어를 입력하세요 (종료 : 'q')");
            String englishWord = scanner.nextLine();
            if (englishWord.equals("q")){
                break;
            }

            System.out.println("한글 뜻을 입력하세요: ");
            String koreanMeaning = scanner.nextLine();
            dictionary.put(englishWord,koreanMeaning);
        }

        System.out.println("== 단어 검색 단계 ==");
        while (true){
            System.out.println("연어 단어를 입력하세요 (종료 : 'q')");
            String searchWord = scanner.nextLine();
            if (searchWord.equals("q")){
                break;
            }

            if (dictionary.containsKey(searchWord)){
                String koreanMeanig = dictionary.get(searchWord);
                System.out.println(searchWord + "의 뜻: " + koreanMeanig);
            }else{
                System.out.println(searchWord + "은(는) 사전에 없는 단어 입니다.");
            }
        }
    }
}
