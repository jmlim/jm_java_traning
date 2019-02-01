package io.jmlim.java.traning.java8.javatime;

import java.time.*;


/**
 * LocalDate, LocalTime, LocalDateTime
 * <p>
 * <p>
 * <p>
 * java8 이전에는 아래와 같은 고전적인 Date 및 Calendar API를 사용하여 날짜를 출력하고 변경하였다.
 * <p>
 * java.util.Date - 날짜와 시간, 기본 시간대를 사용하여 출력.
 * java.util.Calendar - 날짜와 시간, 날짜를 조작하는데 더 많은 메소드 제공.
 * java.text.SimpleDateFormat - 날짜와 달력을위한 형식 (날짜 -> 텍스트), 변환 (텍스트 -> 날짜).
 * <p>
 * Java 8에서는 새로운 java.time 패키지에 새로운 날짜 및 시간 API(JSR310 및 Joda-time에서 영감을 얻음)가 추가되었습니다.
 * <p>
 * java.time.LocalDate - 날짜(시간 포함하지 않음).
 * java.time.LocalTime - 시간(날짜 포함하지 않음).
 * java.time.LocalDateTime - 날짜 및 시간, 타임존 사용하지 않음.
 * java.time.ZonedDateTime - 날짜 및 시간, 타임존 사용.
 * java.time.DateTimeFormatter - java.time에 대한 형식 (날짜 -> 텍스트), 변환 (텍스트 -> 날짜)
 * java.time.Duration - 시간을 초 단위 및 나노초 단위로 측정합니다.
 * java.time.Period - 시간을 년, 월, 일로 측정한다.
 * java.time.TemporalAdjuster - 날짜를 조정한다.
 */
public class WorkingWithLocalDate2 {
    public static void main(String[] args) {

        //날짜 시간 증감.
        LocalDateTime localDateTime = LocalDateTime.of(2018, 12, 12, 0, 0, 0);
        LocalDateTime changedLocalDateTime = localDateTime.plusDays(1);  // 일
        System.out.println(changedLocalDateTime); // 출력 : 2018-12-13T00:00

        changedLocalDateTime = localDateTime.plusMonths(1);  // 월
        System.out.println(changedLocalDateTime); //출력 : 2019-01-12T00:00

        changedLocalDateTime = localDateTime.plusHours(1); // 시간
        System.out.println(changedLocalDateTime); //출력 : 2018-12-12T01:00

        changedLocalDateTime = localDateTime.plusWeeks(1); // 주
        System.out.println(changedLocalDateTime); //출력 : 2018-12-19T00:00

        changedLocalDateTime = localDateTime.minusYears(1);  // 년
        System.out.println(changedLocalDateTime); //출력 : 2017-12-12T00:00

        changedLocalDateTime = localDateTime.minusMinutes(1);  // 분
        System.out.println(changedLocalDateTime); //출력 : 2018-12-11T23:59


        // Duration은 두 “시간” 사이의 간격을 나타내는 반면에

        LocalTime startTime = LocalTime.of(00,00,00);
        LocalTime endTime = LocalTime.of(1,00,00);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration.getSeconds());      // 초의 차이 //3600
        System.out.println(duration.getNano());         // 나노초의 차이


        // Period는 두 “날짜” 사이의 간격을 나타낸다는 차이점이 있다.

        /**
         * 한편, Period 클래스는 두 날짜 사이의 간격을 년/월/일 단위로 나타냅니다.
         * Duration과 마찬가지로 between() 정적 메소드를 제공하고 있으며,
         * 시작 날짜와 종료 날짜를 나타내는 두 개의 LocalDate 객체를 인자로 받습니다.
         * 아래 예제는 세계 2차 대전이 얼마동안 지속이 되었는지를 구하는 코드입니다.
         * 1939년 9월 1일에 시작되어 1945년 9월 2일에 끝난 이 전쟁은 6년 1일간 치뤄졌습니다.
         * */

        LocalDate startDate = LocalDate.of(2010, 10, 18);
        LocalDate endDate = LocalDate.of(2018, 12, 12);

        Period period = Period.between(startDate, endDate);

        System.out.println(period.getYears() + " 년" + period.getMonths() + " 월" + period.getDays() + " 일");
        //출력 8 년1 월24 일


        /**
         * Duration 또는 Period 객체를 생성하지 않고도 간편하게 특정 시간 단위로 시간의 길이를 구하는 방법이 있습니다. 바로 아래 예체처럼 ChronoUnit을 사용하면 됩니다.
         *
         * */
    }
}
