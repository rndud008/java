package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);

        String fileName = str.substring(0,index);
        String extName = str.substring(index);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
