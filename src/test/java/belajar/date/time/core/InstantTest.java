package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {

    @Test
    void testCreate() {
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.ofEpochMilli(System.currentTimeMillis());

        System.out.println(instant1);
        System.out.println(instant2);
    }

    @Test
    void testModify() {
        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plusMillis(1000);
        Instant instant3 = instant1.plusSeconds(1000);
        Instant instant4 = instant1.minusMillis(1000);
        Instant instant5 = instant1.minusSeconds(1000);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
        System.out.println(instant4);
        System.out.println(instant5);
    }

    @Test
    void testGetData() {
        Instant instant1 = Instant.now();
        long epochMilli = instant1.toEpochMilli();
        long epochSecond = instant1.getEpochSecond();
        int nano = instant1.getNano();

        System.out.println(epochMilli);
        System.out.println(epochSecond);
        System.out.println(nano);
    }

    @Test
    void testKonversi() {
        Instant instant1 = Instant.now();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.of("Asia/Jakarta"));
        LocalTime localTime = LocalTime.ofInstant(instant1, ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant1, ZoneId.of("Asia/Jakarta"));
        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant1, ZoneId.of("Asia/Jakarta"));

        System.out.println(localDateTime);
        System.out.println(localTime);
        System.out.println(zonedDateTime);
        System.out.println(offsetDateTime);
    }

    @Test
    void testKonversi2() {
        Instant instant1 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        Instant instant2 = ZonedDateTime.now().toInstant();

        System.out.println(instant1);
        System.out.println(instant2);
    }
}
