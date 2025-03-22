package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String s : splitStr){
            System.out.println(s);
        }

        String joinStr = "";
        int index = 1;
        for (String s : splitStr){
            joinStr += s ;
            if (splitStr.length != index){
                joinStr += "-";
            }
            index++;
        }

        System.out.println("joinStr = " + joinStr);
        // join()
        String joinedStr = String.join("-","A","B","C");
        System.out.println("joinedStr = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);

    }
}
