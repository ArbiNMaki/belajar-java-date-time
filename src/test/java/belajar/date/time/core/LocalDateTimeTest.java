package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

    @Test
    void testCreate() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2024, Month.JUNE, 5, 8, 22);
        LocalDateTime localDateTime3 = LocalDateTime.parse("2024-06-05T08:22:59.13333");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void testModify() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withYear(2024);
        LocalDateTime localDateTime3 = localDateTime1.withYear(2024).withMonth(2);
        LocalDateTime localDateTime4 = localDateTime1.withYear(2024).withMonth(2).withDayOfMonth(29);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);
    }

    @Test
    void testManipulate() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(1997);
        LocalDateTime localDateTime3 = localDateTime1.plusYears(1997).plusMonths(4);
        LocalDateTime localDateTime4 = localDateTime1.plusYears(1997).plusMonths(4).plusDays(9);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);
    }

    @Test
    void testGetDataLocalDateTime() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        int localDateTime2 = localDateTime1.getYear();
        Month localDateTime3 = localDateTime1.getMonth();
        int localDateTime4 = localDateTime1.getDayOfMonth();
        int localDateTime5 = localDateTime1.getHour();
        int localDateTime6 = localDateTime1.getMinute();
        int localDateTime7 = localDateTime1.getSecond();
        int localDateTime8 = localDateTime1.getNano();

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
        System.out.println(localDateTime4);
        System.out.println(localDateTime5);
        System.out.println(localDateTime6);
        System.out.println(localDateTime7);
        System.out.println(localDateTime8);
    }

    @Test
    void testKonversiLocalDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime result = localDate.atTime(LocalTime.now());
        System.out.println(result);
    }

    @Test
    void testKonversiLocalTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime result = localTime.atDate(LocalDate.now());
        System.out.println(result);
    }
}
