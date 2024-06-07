package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {

    @Test
    void testCreate() {
        Clock clockUTC = Clock.systemUTC();
        Clock clockSystem = Clock.systemDefaultZone();
        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));

        System.out.println(clockUTC);
        System.out.println(clockSystem);
        System.out.println(clockJakarta);
    }

    @Test
    void testGetData() throws Throwable {
        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant1 = clockJakarta.instant();
        System.out.println(instant1);
        Thread.sleep(1_000);

        Instant instant2 = clockJakarta.instant();
        System.out.println(instant2);
        Thread.sleep(1_000);
    }

    @Test
    void testDateTime() {
        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clockJakarta);
        YearMonth yearMonth = YearMonth.now(clockJakarta);
        LocalTime localTime = LocalTime.now(clockJakarta);
        LocalDate localDate = LocalDate.now(clockJakarta);
        LocalDateTime localDateTime = LocalDateTime.now(clockJakarta);
        OffsetTime offsetTime = OffsetTime.now(clockJakarta);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clockJakarta);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clockJakarta);

        System.out.println(year);
        System.out.println(yearMonth);
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);
        System.out.println(offsetTime);
        System.out.println(offsetDateTime);
    }
}
