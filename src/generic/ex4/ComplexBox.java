package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

//    public <Z> Z printAndReturn(Z z){
//        System.out.println("animal.className: " + animal.getClass().getName());
//        System.out.println("z.getClass().getName() = " + z.getClass().getName());
//        return z;
//    }

    public <T> T printAndReturn(T t){
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("z.getClass().getName() = " + t.getClass().getName());
        return t;
    }

    // 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가져서
    // 타입이 Dog 나 Cat 이 들어와도
    // 클래스에 지정한 T타입 과는 별개로 봐도 됨.
    // 해당 T는 Object 타입.
}
