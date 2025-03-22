package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
       String fruits = "apple,banana,mango";

      String[] splitFruits = fruits.split(",");

      for (String s : splitFruits){
          System.out.println("s = " + s);
      }


        String join = String.join("->", splitFruits);
        System.out.println("join = " + join);

    }
}
