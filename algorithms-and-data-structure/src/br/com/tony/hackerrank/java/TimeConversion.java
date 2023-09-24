package br.com.tony.hackerrank.java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * <a href="https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true">Challenge link</a>
 * */
public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }

    /**
     * Converter 12h time to 24h time, example:
     * 07:05:45PM should converter to 19:05:45
     * */
    public static String timeConversion(String s) {
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
