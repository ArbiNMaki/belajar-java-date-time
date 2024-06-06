package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {

    @Test
    void testCreate() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(zonedDateTime2);

        ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneOffset.ofHours(7));
        System.out.println(zonedDateTime3);

        ZonedDateTime zonedDateTime4 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Jakarta"));
        System.out.println(zonedDateTime4);
    }

    @Test
    void testParse() {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2024-06-07T04:28:10+07:00[Asia/Jakarta]");
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2024-06-07T04:28:10+09:00");
        System.out.println(zonedDateTime2);
    }

    @Test
    void testModify() {
        ZonedDateTime znd1 = ZonedDateTime.now();
        System.out.println(znd1);

        ZonedDateTime znd2 = znd1.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println(znd2);

        ZonedDateTime znd3 = znd1.withZoneSameLocal(ZoneId.of("GMT"));
        System.out.println(znd3);
    }
}
