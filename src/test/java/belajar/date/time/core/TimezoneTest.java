package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneTest {

    @Test
    void testCreate() {
        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);

        TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT");
        System.out.println(timeZoneGMT);

        String[] availableIDs = TimeZone.getAvailableIDs();
//        Arrays.asList(availableIDs).forEach(zoneId -> System.out.println(zoneId));

        // Lambda
        Arrays.asList(availableIDs).forEach(System.out::println);
    }

    @Test
    void testDate() {
        Date date = new Date();
        System.out.println(date.toString());

        // .toGMTString() Deprecated
        System.out.println(date.toGMTString());
    }

    @Test
    void testCalendar() {
        Calendar calendar1 = Calendar.getInstance(); // Default timezone
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar2.get(Calendar.HOUR_OF_DAY));

        calendar1.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
    }
}
