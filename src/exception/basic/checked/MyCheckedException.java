package exception.basic.checked;

public class MyCheckedException extends Exception{
    // Exception을 상속받은 예외는 체크예외가 된다.
    public MyCheckedException(String message){
        super(message);
    }

}
