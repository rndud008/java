package lamda.lamda1;

import lamda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! lamda");
            }
        };
        System.out.println("class.class = " + procedure1.getClass());
        System.out.println("class.instance= " + procedure1);

        Procedure procedure2 = ()->{
            System.out.println("hello! lamda");
        };

        System.out.println("lambda.class = " + procedure2.getClass());
        System.out.println("lambda.instance = " + procedure2);
    }
}
