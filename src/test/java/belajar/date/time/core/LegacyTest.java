package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {

    @Test
    void testLegacyToNew() {
        Date date = new Date();
        Instant instantDate = date.toInstant();
        System.out.println(instantDate);

        Calendar calendar = Calendar.getInstance();
        Instant instantCalendar = calendar.toInstant();
        System.out.println(instantCalendar);

        TimeZone timeZone = TimeZone.getDefault();
        ZoneId zoneId = timeZone.toZoneId();
        System.out.println(zoneId);
    }

    @Test
    void testNewToLegacy() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Date date = Date.from(zonedDateTime.toInstant());
        System.out.println(date);

        Calendar calendar = GregorianCalendar.from(zonedDateTime);
        System.out.println(calendar);

        ZoneId zoneId = ZoneId.systemDefault();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
        System.out.println(timeZone);
    }
}
