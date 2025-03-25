package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate,endDate);
        long between = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작날짜: " + startDate);
        System.out.println("목표날짜: " + endDate);
        System.out.println("남은기간: " + period.getYears() + "년 " + period.getMonths() + "월 " + period.getDays() + "일");
        System.out.println("디데이: " + between + "일 남음");

    }
}
