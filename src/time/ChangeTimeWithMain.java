package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30 ,59);
        System.out.println("dt = " + dt);

        LocalDateTime chagedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("chagedDt1 = " + chagedDt1);

        LocalDateTime chagedDt2 = dt.withYear(2020);
        System.out.println("chagedDt2 = " + chagedDt2);

        //TemporalAdjuster 사용
        // 다음주 금요일
        LocalDateTime wiht1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준날짜: " + dt);
        System.out.println("다음 금요일: " + wiht1);

        // 이번달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일 = " + with2);

    }
}
