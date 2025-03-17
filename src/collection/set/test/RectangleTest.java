package collection.set.test;

import java.util.HashSet;

public class RectangleTest {
    public static void main(String[] args) {

        HashSet<Rectangle> rectangleHashSet = new HashSet<>();

        rectangleHashSet.add(new Rectangle(10,10));
        rectangleHashSet.add(new Rectangle(20,20));
        rectangleHashSet.add(new Rectangle(20,20)); // 중복

        for (Rectangle rectangle : rectangleHashSet){
            System.out.println("rectangle = " + rectangle);
        }

    }
}
