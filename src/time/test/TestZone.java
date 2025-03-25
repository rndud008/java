package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = zdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime americaTime = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + zdt );
        System.out.println("americaTime = " + americaTime);
        System.out.println("londonTime = " + londonTime);
    }
}
