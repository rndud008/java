package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("년도를 입력하세요: ");
        int year = sc.nextInt();

        System.out.println("월을 입력하세요: ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {

        LocalDate firstDayofMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayofNextMOnth = firstDayofMonth.plusMonths(1);

        // 월요일 =1 (1%7=1) ... 일요일 7(7%7 = 0)
        int offsetWeekDays = firstDayofMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayofMonth;
        while (dayIterator.isBefore(firstDayofNextMOnth)){
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }

    }
}
