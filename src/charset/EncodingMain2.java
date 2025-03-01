package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingMain2 {

    private static  final Charset EUC_KR = Charset.forName("EUC-KR");
    private static  final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("== ASCII 영문 인코딩 ==");
        text("A", US_ASCII, US_ASCII);
        text("A", US_ASCII, ISO_8859_1);
        text("A", US_ASCII, EUC_KR);
        text("A", US_ASCII, MS_949);
        text("A", US_ASCII, UTF_8);
        text("A", US_ASCII, UTF_16BE);

        System.out.println("== 한글 인코딩 - 기본 ==");

        text("가", US_ASCII, US_ASCII);
        text("가", ISO_8859_1, ISO_8859_1);
        text("가", EUC_KR, EUC_KR);
        text("가", MS_949, MS_949);
        text("가", UTF_8, UTF_8);
        text("가", UTF_16BE, UTF_16BE);

        System.out.println("== 한글 인코딩 - 복잡한 문자 ==");
        text("쀍", EUC_KR, EUC_KR);
        text("쀍", MS_949, MS_949);
        text("쀍", UTF_8, UTF_8);
        text("쀍", UTF_16BE, UTF_16BE);

        System.out.println("== 한글 인코딩 - 디코딩이 다른경우 ==");
        text("가", EUC_KR, MS_949);
        text("쀍", MS_949, EUC_KR); // 인코딩 가능, 디코딩 X
        text("가", EUC_KR, UTF_8); // X
        text("가", MS_949, UTF_8); // X
        text("가", UTF_8, MS_949); // X

        System.out.println("== 영문 인코딩 - 디코딩이 다른경우 ==");
        text("A", EUC_KR, UTF_8);
        text("A", MS_949, UTF_8);
        text("A", UTF_8, MS_949);
        text("A", UTF_8, UTF_16BE);
    }

    private static void text(String text, Charset endcodingCarset, Charset decodingCharset){
        byte[] encoded = text.getBytes(endcodingCarset);

        String decoded = new String(encoded,decodingCharset);

        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte -> [%s] 디코딩 -> %s\n",
                text, endcodingCarset, Arrays.toString(encoded), encoded.length, decodingCharset, decoded);

    }



}
