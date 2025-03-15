package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;
import reflection.data.Calculator;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("야옹이",100);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog targetDog = new Dog("큰멍멍이", 200);
//        Dog bigger = AnimalMethod.bigger(dog, cat);// 타입추론이 Dog 와 Cat으로..? 두가지가 들어가 추론되지 않음.
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
