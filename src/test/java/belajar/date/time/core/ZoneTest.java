package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneTest {

    @Test
    void testZoneId() {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneIdGMT = ZoneId.of("GMT");
        System.out.println(zoneIdGMT);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
    }

    @Test
    void testZoneOffset() {
        ZoneOffset zoneOffset1 = ZoneOffset.of("+07:00");
        System.out.println(zoneOffset1);

        ZoneOffset zoneOffset2 = ZoneOffset.ofHours(-7);
        System.out.println(zoneOffset2);

        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(5, 30);
        System.out.println(zoneOffset3);
    }
}
