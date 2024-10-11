package de.telran.module_4.lesson_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.Duration;
import java.time.Period;

public class MainLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Adding 1 year, 1 month, 1 week and 1 day
        LocalDateTime localDateTime = now
                .plusYears(1)
                .plusMonths(1)
                .plusWeeks(1)
                .plusDays(1);

        System.out.println(localDateTime);

        // Изменение

        // Subtracting 1 year, 1 month, 1 week and 1 day
        localDateTime = localDateTime.minusYears(1)
                .minusMonths(1)
                .minusWeeks(1)
                .minusDays(1);
        System.out.println(localDateTime);

        // Adding 1 hour, 1 minute, 1 second and 10000 nanoseconds
        localDateTime = localDateTime.plusHours(1)
                .plusMinutes(1)
                .plusSeconds(1)
                .plusNanos(10000);

        System.out.println(localDateTime);

        // Subtracting 1 hour, 1 minute, 1 second and 10000 nanoseconds
        localDateTime = localDateTime.minusHours(1)
                .minusMinutes(1)
                .minusSeconds(1)
                .minusNanos(10000);

        System.out.println(localDateTime);

        // вывод в строку используя форматтер
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss a");

        // Formatting LocalDateTime to string
        String dateTimeString = localDateTime.format(formatter);

        System.out.println(dateTimeString);

        Locale locale = new Locale("uk");
        formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm:ss.SSS", locale);
        System.out.println("Uk -> "+ localDateTime.format(formatter));


        // Разница между датами
        LocalDateTime toDateTime = LocalDateTime.of(2014, 9, 9, 19, 46, 45);
        LocalDateTime fromDateTime = LocalDateTime.of(1984, 12, 16, 7, 45, 55);

        Period period = Period.between(fromDateTime.toLocalDate(), toDateTime.toLocalDate()); // из даты
        Duration duration = Duration.between(fromDateTime.toLocalTime(), toDateTime.toLocalTime()); // по времени

        System.out.println(period.getYears() + " years " +
                period.getMonths() + " months " +
                period.getDays() + " days " +
                duration.toHoursPart() + " hours " +
                duration.toMinutesPart() + " minutes " +
                duration.toSecondsPart() + " seconds.");

    }
}
