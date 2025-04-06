package lamda.lamda1;

@FunctionalInterface
// 해당 어노트에션을 선언하면 메서드를 추가할때 오류가 발생.
public interface SamInterface {
    void run();
//    void go(); //  컴파일 오류
}
