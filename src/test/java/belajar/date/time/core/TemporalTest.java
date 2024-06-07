package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {

    @Test
    void testCreate() {
        Temporal temporal1 = LocalTime.now();
        Temporal temporal2 = LocalDate.now();
        Temporal temporal3 = LocalDateTime.now();
        Temporal temporal4 = ZonedDateTime.now();
        Temporal temporal5 = Year.now();
        Temporal temporal6 = YearMonth.now();
        Temporal temporal7 = Instant.now();

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
        System.out.println(temporal4);
        System.out.println(temporal5);
        System.out.println(temporal6);
        System.out.println(temporal7);
    }

    @Test
    void testTemporalAmount() {
        Temporal localDateTime1 = LocalDateTime.now();
        Temporal localDateTime2 = localDateTime1.plus(Duration.ofHours(10));
        Temporal localDateTime3 = localDateTime1.minus(Period.of(0, 10, 10));

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void testTemporalUnit() {
        long between1 = ChronoUnit.SECONDS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        long between2 = ChronoUnit.MINUTES.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        long between3 = ChronoUnit.HOURS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        long between4 = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));

        System.out.println(between1);
        System.out.println(between2);
        System.out.println(between3);
        System.out.println(between4);
    }

    @Test
    void testTemporalField() {
        Temporal temporal = LocalDateTime.now();

        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(temporal.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));
    }

    @Test
    void testTemporalQuery() {
        LocalDateTime localDateTime = LocalDateTime.now();

        List<Integer> integers = localDateTime.query(temporal -> {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(temporal.get(ChronoField.YEAR));
            list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
            list.add(temporal.get(ChronoField.DAY_OF_MONTH));
            return  list;
        });

        System.out.println(integers);
    }

    @Test
    void testTemporalAdjuster() {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate localDate3 = localDate1.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate localDate4 = localDate1.with(TemporalAdjusters.firstDayOfYear());
        LocalDate localDate5 = localDate1.with(TemporalAdjusters.lastDayOfYear());

        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
        System.out.println(localDate5);
    }
}
