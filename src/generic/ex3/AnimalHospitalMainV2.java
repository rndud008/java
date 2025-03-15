package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {

        // 개병원은 개만 받을수 있고, 고양이 병원은 고양이만 받을수 이썽야 한다.
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> ObjectHospital = new AnimalHospitalV2<>();

        // 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올수 있다
        // 타입 매개변수를 어떤 타입이든 수용할수 있는 Object로 가정하고 Object 의 기능만 사용할수 잇따.
    }

}
