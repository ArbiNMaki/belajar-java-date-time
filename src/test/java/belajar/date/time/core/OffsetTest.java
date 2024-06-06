package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTest {

    @Test
    void testCreate() {
        OffsetTime offsetTime1 = OffsetTime.now();
        System.out.println(offsetTime1);
        OffsetTime offsetTime2 = OffsetTime.of(LocalTime.now(), ZoneOffset.ofHours(7));
        System.out.println(offsetTime2);
        OffsetTime offsetTime3 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println(offsetTime3);
        OffsetTime offsetTime4 = OffsetTime.parse("23:23:23.100+07:00");
        System.out.println(offsetTime4);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.now();
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
        System.out.println(offsetDateTime2);
    }

    @Test
    void testKonversi() {
        LocalTime localTime = LocalTime.now();
        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
        LocalTime localTime1 = offsetTime.toLocalTime();

        LocalDateTime localDateTime = LocalDateTime.now();
        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        LocalDate localDate = offsetDateTime.toLocalDate();
        LocalTime localTime2 = offsetDateTime.toLocalTime();

        System.out.println(localTime1);
        System.out.println(localDateTime1);
        System.out.println(localDate);
        System.out.println(localTime2);
    }
}
