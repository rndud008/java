package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object o = new Object();

//        Object[] objects= {dog,car, o};
        Object[] objects = new Object[3];
        objects[0] = dog;
        objects[1] = car;
        objects[2] = o;

        size(objects);

    }

    public static void size(Object[] objs){
        System.out.println("전달된 객체의 수는: "  + objs.length);
    }
}
