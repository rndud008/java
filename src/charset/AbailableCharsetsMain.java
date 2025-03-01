package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AbailableCharsetsMain {
    public static void main(String[] args) {

        // 이용 가능한 모든 charset 자바 + OS

        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        for (String charsetName : charsets.keySet()){
            System.out.println("charsetName = " + charsetName);
        }

        // 문자로 조회(대소문자 구분X), MS949, ms949, x-windows-949
        System.out.println("=====");
        Charset charset1 = Charset.forName("MS949");
        System.out.println("charset1 = " + charset1);

        // 별칭 조회
        Set<String> aliases = charset1.aliases();
        for (String alias : aliases){
            System.out.println("alias = " + alias);
        }

        //UTF-8 문자로 조회
        Charset charset2 = Charset.forName("UTF-8"); // 이것은 상수로 정해져있으니 인텔리제이? 에서 권고 하는것.
        System.out.println("charset2 = " + charset2);

        //UTF-8 상수로 조회
        Charset charset3 = StandardCharsets.UTF_8;
        System.out.println("charset3 = " + charset3);
        
        // 시스템의 기본 Charset 조회
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("defaultCharset = " + defaultCharset);


    }
}
