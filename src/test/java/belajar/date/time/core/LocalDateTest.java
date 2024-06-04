package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void testLocalDate() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2024, Month.JUNE, 4);
        LocalDate localDate3 = LocalDate.parse("2024-06-04");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testModifyLocalDate() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(1997);
        LocalDate localDate3 = localDate1.withMonth(4);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testModifyLocalDate2() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusYears(10);
        LocalDate localDate3 = localDate1.minusMonths(10);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void testGetLocalDate() {
        LocalDate localDate = LocalDate.now();

        int year = localDate.getYear();
        Month month = localDate.getMonth();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int dayOfYear = localDate.getDayOfYear();

        System.out.println(year);
        System.out.println(month);
        System.out.println(monthValue);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        System.out.println(dayOfYear);
    }
}
