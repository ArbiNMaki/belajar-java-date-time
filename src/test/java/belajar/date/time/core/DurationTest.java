package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {

    @Test
    void testCreate() {
        Duration duration1 = Duration.ofSeconds(10);
        Duration duration2 = Duration.ofMillis(10);
        Duration duration3 = Duration.ofHours(10);
        Duration duration4 = Duration.ofMinutes(10);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
    }

    @Test
    void testGetData() {
        Duration duration = Duration.ofHours(10);

        long days = duration.toDays();
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();
        long millis = duration.toMillis();
        long nanos = duration.toNanos();

        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(millis);
        System.out.println(nanos);
    }

    @Test
    void testCount() {
        Duration duration1 = Duration.between(LocalTime.of(10, 10), LocalTime.of(20, 20));
        Duration duration2 = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));

        System.out.println(duration1);
        System.out.println(duration2);
    }
}
