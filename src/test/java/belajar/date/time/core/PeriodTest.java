package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    @Test
    void testCreate() {
        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofYears(10);
        Period period5 = Period.of(10, 10, 10);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void testGetData() {
        Period period = Period.of(10, 10, 10);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println(years);
        System.out.println(months);
        System.out.println(days);
    }

    @Test
    void testCount() {
        Period period = Period.between(
                LocalDate.of(1997, 4, 9),
                LocalDate.of(2024, 6, 7)
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
