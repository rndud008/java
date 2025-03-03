package annotation.basic;

import util.MyLogger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 자바가 실행중에도 남아 잇다
//@Retention(RetentionPolicy.SOURCE) //  소스 코드에만 암아 있고 컴파일 시점에 제거
//@Retention(RetentionPolicy.CLASS) // 컴파일후 class 파일까지는 남아 잇찌만 자바 실행 시점에 제거.(기본값)
public @interface AnnoElement {
    // void 타입은 불가.
    String value();
    int count() default 0;
    String[] tags() default {};

    // MyLogger data() 다른 타입은 적용 x
    Class<? extends MyLogger> annoData() default  MyLogger.class; // 클래스정보는 가능
}
