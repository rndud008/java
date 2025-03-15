package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    // 타입 매개변수르 T 를 Animal 과 그자식만 받을수 있도록 제한.
    // 즉 T 의 상한은 Animal 이 되는것.
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
