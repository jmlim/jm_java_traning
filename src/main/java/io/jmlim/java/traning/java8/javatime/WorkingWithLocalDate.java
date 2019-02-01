package io.jmlim.java.traning.java8.javatime;

import java.time.*;
import java.time.format.DateTimeFormatter;


/**
 *
 * LocalDate, LocalTime, LocalDateTime
 *
 *
 *
 java8 이전에는 아래와 같은 고전적인 Date 및 Calendar API를 사용하여 날짜를 출력하고 변경하였다.

 java.util.Date - 날짜와 시간, 기본 시간대를 사용하여 출력.
 java.util.Calendar - 날짜와 시간, 날짜를 조작하는데 더 많은 메소드 제공.
 java.text.SimpleDateFormat - 날짜와 달력을위한 형식 (날짜 -> 텍스트), 변환 (텍스트 -> 날짜).

 Java 8에서는 새로운 java.time 패키지에 새로운 날짜 및 시간 API(JSR310 및 Joda-time에서 영감을 얻음)가 추가되었습니다.

 java.time.LocalDate - 날짜(시간 포함하지 않음).
 java.time.LocalTime - 시간(날짜 포함하지 않음).
 java.time.LocalDateTime - 날짜 및 시간, 타임존 사용하지 않음.
 java.time.ZonedDateTime - 날짜 및 시간, 타임존 사용.
 java.time.DateTimeFormatter - java.time에 대한 형식 (날짜 -> 텍스트), 변환 (텍스트 -> 날짜)
 java.time.Duration - 시간을 초 단위 및 나노초 단위로 측정합니다.
 java.time.Period - 시간을 년, 월, 일로 측정한다.
 java.time.TemporalAdjuster - 날짜를 조정한다.

 *
 *
 * */
public class WorkingWithLocalDate {
    public static void main(String[] args) {
        //컴퓨터의 현재 날짜 정보.
        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        /**
         *
         특정 일, 월 및 연도 지정하여 반환하고 싶을 때 LocalDate.of 메서드를 사용하거나 parse 메서드를 사용한다.
         아래 코드를 참조..
         * */
        //아래날짜로 변경 (2017-12-12)
        localDate = LocalDate.of(2017, 12, 12);
        System.out.println(localDate);

        //아래와 같이도 변경이 가능하다.
        localDate = LocalDate.parse("2018-12-05");
        System.out.println(localDate);

        // 2018년 12월 5일에서 내일날짜로 변경
        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println(tomorrow); //  2018년 12월 6일 출력.


        // LocalDate parse 사용 시 포멧 형식 변경해서 사용 시
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = "18/09/2018";
        //convert String to LocalDate
        localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

        // LocalDateTime 사용 시 pattern 지정하여 출력하기.
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before : " + now);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter2);
        System.out.println("After : " + formatDateTime);

        /**
         * 출력값 :
         * Before : 2018-12-12T17:56:02.189
         * After : 2018-12-12 17:56:02
         * */

        String datetime = "2018-12-09 13:00";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime formatDateTime1 = LocalDateTime.parse(datetime, formatter3);

        System.out.println("Before : " + now);
        System.out.println("After : " + formatDateTime1);
        System.out.println("After : " + formatDateTime1.format(formatter3));

        /**
         * 출력값
         * Before : 2018-12-12T17:58:13.037
         * After : 2018-12-09T13:00
         * After : 2018-12-09 13:00
         * */

        System.out.println();

        LocalDateTime dateTime4 = LocalDateTime.of(2018, Month.DECEMBER, 12, 9, 00, 00);
        // UTC+9
        ZonedDateTime seoulTime = dateTime4.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println("ZonedDateTime : " + seoulTime);
        Instant instant = seoulTime.toInstant();
        System.out.println("Instant : " + instant);

        /**
         *
         *
         * 출력값..
         *  서울시간이 UTC (세계 표준시) 보다 9시간이 빠르다.
         *  만약 서울시간이 2018-12-12 09:00:00 일경우 표준시는  2018-12-12 00:00:00 가 된다.
            ZonedDateTime : 2018-12-12T09:00+09:00[Asia/Seoul]
            Instant : 2018-12-12T00:00:00Z
         * */


        //Period and Duration examples


    }
}
