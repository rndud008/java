package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num =100;
        boolean bol = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //ValueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);
        String bolString = String.valueOf(bol);
        System.out.println("bolString = " + bolString);
        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString);

        String numString2 = "" + num;
        System.out.println("numString2 = " + numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("strCharArray = " + strCharArray);
        System.out.println( strCharArray);
        for (char c : strCharArray){
            System.out.print(c);
        }
        System.out.println();


    }
}
