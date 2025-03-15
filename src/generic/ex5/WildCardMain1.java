package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);


        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        catBox.set(new Cat("야옹이",50));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        // 제네릭을 사용하면 반환타입을 자유롭게 받을수 잇음
        // 하지만 와일드 카드를 사용하면 전달한 타입만을 반환 받을수 있음.

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        System.out.println("dog = " + dog);
        System.out.println("animal = " + animal);

        // 와일드카드는 제네릭을 쉽게 쓸수있게 해주는 도구.
        // 와일드카드는 제네릭타입이나 제네릭메서드를 선언하는 것이 아니라
        // 와일드카드는 이미 만들어진 제네릭 타입을 활용할때 사용
        // 와일드카드는 제네릭 메서드가 아니고 일반적인 메서드.
    }
}
