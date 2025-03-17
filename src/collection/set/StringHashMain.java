package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';

        // 각 문자를 int 형으로 캐스팅하면 문자의 고유한 숫자를 확인 가능.
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        // hashCode
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"C\") = " + hashCode("C"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));

        //hashIndex
        int hashCodeA = hashCode("A");
        int hashIndex = hashIndex(hashCodeA);
        System.out.println("hashIndex = " + hashIndex);

        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode(\"B\")) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashCode(\"AB\")) = " + hashIndex(hashCode("AB")));
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static int hashCode(String str) {
        char[] chars = str.toCharArray();
        int sum = 0;
        for (char c : chars){
            sum = sum + (int) c;
        }

        return sum;
    }
}
