package belajar.date.time.core;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParsingFormatingTest {

    @Test
    void testParsing() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");

        LocalDate localDate = LocalDate.parse("2024 06 07", formatter);
        System.out.println(localDate);
    }

    @Test
    void testFormatting() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);
        System.out.println(format);
    }

    @Test
    void testDefaultFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        LocalDate localDate = LocalDate.parse("2024-06-07", formatter);
        String format = localDate.format(formatter);
        System.out.println(format);
    }

    @Test
    void testI18N() {
        Locale locale = new Locale("in", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);
        System.out.println(format);
    }
}
