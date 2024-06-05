package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void testCreateLocalTime() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(10, 10, 10);
        LocalTime localTime3 = LocalTime.parse("10:10");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void testModifyLocalTime() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.withHour(10);
        LocalTime localTime3 = localTime1.withHour(10).withMinute(20);
        LocalTime localTime4 = localTime1.withHour(10).withMinute(20).withSecond(30);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
        System.out.println(localTime4);
    }

    @Test
    void testManipulateLocalTime() {
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusHours(10);
        LocalTime localTime3 = localTime1.minusHours(5).plusMinutes(5);
        LocalTime localTime4 = localTime1.plusHours(10).minusMinutes(15).plusSeconds(25);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
        System.out.println(localTime4);
    }

    @Test
    void testGetDataLocalTime() {
        LocalTime localTime1 = LocalTime.now();

        int hour = localTime1.getHour();
        int minute = localTime1.getMinute();
        int second = localTime1.getSecond();
        int nano = localTime1.getNano();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);
    }
}
