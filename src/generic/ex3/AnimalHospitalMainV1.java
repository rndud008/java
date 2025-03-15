package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        // 개병원은 개만 받을수 있고, 고양이 병원은 고양이만 받을수 이썽야 한다.
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog  = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1",300);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        //문제1: 개병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 체크 실패: 컴파일 오류 가 발생하지 않음.

        // 문제2: 개 타입 변환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("biggerDog = " + biggerDog);
    }

}
