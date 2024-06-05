package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearMonthDayTest {

    @Test
    void testCreate() {
        Year year1 = Year.now();
        Year year2 = Year.of(1997);
        Year year3 = Year.parse("2024");

        YearMonth ym1 = YearMonth.now();
        YearMonth ym2 = YearMonth.of(1997, Month.APRIL);
        YearMonth ym3 = YearMonth.parse("2024-06");

        MonthDay md1 = MonthDay.of(Month.JUNE, 6);
        MonthDay md2 = MonthDay.now();
        MonthDay md3 = MonthDay.parse("--06-06");

        // Year
        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        // YearMonth
        System.out.println(ym1);
        System.out.println(ym2);
        System.out.println(ym3);

        // MonthDay
        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);
    }

    @Test
    void testKonversiLocalDate() {
        Year year = Year.of(1997);
        System.out.println(year);

        YearMonth ym = year.atMonth(Month.APRIL);
        System.out.println(ym);

        LocalDate localDate = ym.atDay(9);
        System.out.println(localDate);

        MonthDay md = MonthDay.from(localDate);
        System.out.println(md);
    }

    @Test
    void testKonversiLocalDate2() {
        Year year = Year.now();
        System.out.println(year);

        LocalDate localDate = year.atMonth(Month.DECEMBER).atDay(19);
        System.out.println(localDate);

        MonthDay md = MonthDay.from(localDate);
        System.out.println(md);
    }

    @Test
    void testGetData() {
        Year year = Year.now();
        int value = year.getValue();
        System.out.println(value);

        YearMonth ym = YearMonth.now();
        System.out.println(ym);

        int year1 = ym.getYear();
        System.out.println(year1);

        Month month = ym.getMonth();
        System.out.println(month);

        int monthValue = ym.getMonthValue();
        System.out.println(monthValue);
    }
}
