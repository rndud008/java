package company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class source {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // 시작 시간 문자
        // 종료 시간 문자
        int startHour =0;
        int startMin = 30;
        int endHour = 23;
        int endMin = 0;

        String startTime = createStringTime(startHour,startMin);
        String endTime = createStringTime(endHour,endMin);
        System.out.println("startTime = " + startTime);
        System.out.println("endTime = " + endTime);
        // 종료

        // 요일 문자
        String reservationDate = "2025-03-05";
        String reservationYoil = getYoil(reservationDate);
        System.out.println("reservationYoil = " + reservationYoil);
        // 종료

        // 시작 시간 과 종료시간 범위
        // 시작 분 과 종료 분 범위
        int maxHour = 0;
        int maxMin = 0;
        if (startHour == 0 && endHour == 0 && startMin == 0 && endMin == 0){
            maxHour = 23;
            maxMin = 55;
        }else{
            maxHour = endHour;
            maxMin = endMin;
        }
        List<Integer> timeRange = new ArrayList<>();
        Map<Integer,String> startMinAndEndMin = new HashMap<>();
        for (int i = startHour; i <= maxHour; i++) {
            timeRange.add(i);
            int countMin = i == startHour ? startMin : 0;
            String minValue = "";
            boolean first = false;
            while (i < maxHour || (i == maxHour && countMin <= maxMin)){
                if (!first){
                    minValue += countMin;
                    first = true;
                }else {
                    minValue +=  "," +countMin;
                }
                countMin += 5;

                if (countMin >= 60) break;
            }
            startMinAndEndMin.put(i, minValue);
        }

        if (endHour == 0 && startHour != 0){
            timeRange.add(endHour);
        }
        for (Integer number : timeRange){
            System.out.println("number = " + number);
        }
        // 종료

        for (Integer key : startMinAndEndMin.keySet()){
            System.out.println("key = " + key + " startMinAndEndMin = " + startMinAndEndMin.get(key));
        }


    }

    private static String getYoil(String reservationDate) {
        DayOfWeek dayOfWeek = LocalDate.parse(reservationDate).getDayOfWeek();
        String[] days = {"일","월","화","수","목","금","토"};
        System.out.println("localDate = " + dayOfWeek.getValue());
        return days[dayOfWeek.getValue() %7];
    }

    private static String createStringTime(int intHour, int intMin) {
        String hour = intHour < 10 ?  "0" + intHour : String.valueOf(intHour);
        String min =  intMin < 10 ? "0" + intMin : String.valueOf(intMin);

        return hour + ":" + min;
    }


}
