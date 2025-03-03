package annotation.mapping;

public class TestController {
    @SimpleMapping(value = "/")
    public void home(){
        System.out.println("TestController.home");
    }

    @SimpleMapping(value = "/site1")
    //  애노테이션 코드에 추가적인 종보를 주석 처럼 제공
    //  하지만 일반 주석과 달리 애노테이션은 컴파일러나 런타임에서 해석될수 잇는 메타데이터를 제공
    //  애노테이션은 코드에 메모를 달아놓는 것 처럼 특정 정보나 지시를 추가하는 도구로 코드에 대한 메타데이터를 표현
    public void page1(){
        System.out.println("TestController.page1");
    }

}
