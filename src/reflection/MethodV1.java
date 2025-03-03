package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Method;

public class MethodV1 {

    public static void main(String[] args) {
        Class<BasicData> helloCalss = BasicData.class;

        System.out.println("==== methods() ====");
        Method[] methods = helloCalss.getMethods();
        for (Method method : methods){
            System.out.println("method = " + method);
        }

        System.out.println("==== declareMehtods() ====" );
        Method[] declaredMethods = helloCalss.getDeclaredMethods();
        for (Method method : declaredMethods){
            System.out.println("declaredMethod = " + method);
        }
    }
}
