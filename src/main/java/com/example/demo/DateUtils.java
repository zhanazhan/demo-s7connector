package com.example.demo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.Date;

public class DateUtils {
    public static final String DATE_FORMAT_DEFINITION = "yyyy-MM-dd";

    public static final String DATETIME_FORMAT_DEFINITION = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String DATETIME_FORMAT_DEFINITION_WITHOUT_T = "yyyy-MM-dd HH:mm:ss";

    public static final String HOUR_MINS_TIME_FORMAT_DEFINITION = "HH:mm";

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_FORMAT_DEFINITION);

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATETIME_FORMAT_DEFINITION);
    private static final DateTimeFormatter dateTimeFormatterWOT = DateTimeFormatter.ofPattern(DATETIME_FORMAT_DEFINITION_WITHOUT_T);

    public static LocalDate asDate(String date) throws DateTimeParseException {
        TemporalAccessor accessor = dateFormatter.parse(date);
        return LocalDate.from(accessor);
    }

    public static LocalDateTime asDateTime(String date) throws DateTimeParseException {
        TemporalAccessor accessor = dateTimeFormatter.parse(date);
        return LocalDateTime.from(accessor);
    }

    public static String asString(LocalDate date) {
        if (date != null) {
            return date.format(dateFormatter);
        }

        return null;
    }

    public static String asString(LocalDateTime dateTime) {
        if (dateTime != null) {
            return dateTime.format(dateTimeFormatter);
        }

        return null;
    }

    public static Object[] asString(Collection<LocalDate> dates) {
        if (dates != null) {
            return dates.stream().map(d -> asString(d)).toArray();
        }

        return null;
    }

    /* Make the time point to the last second of the day */
    public static ZonedDateTime toZonedEodDateWithTimestamp(LocalDate date) {
        return date.atTime(23, 59, 59).atZone(ZoneId.systemDefault());
    }

    public static LocalDateTime toEodDateWithTimestamp(LocalDate date) {
        return date.atTime(23, 59, 59);
    }

    public static String toZonedEodDateWithTimestampAsString(LocalDate date) {
        return toZonedEodDateWithTimestamp(date).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public static Date toJava7Date(LocalDateTime date) {
        return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static String addEpochIntoParamString(String url) {
        return url + (url.contains("?") ? "&" : "?" ) + "time=" + LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
    }
}
