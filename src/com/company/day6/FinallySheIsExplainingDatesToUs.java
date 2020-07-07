package com.company.day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FinallySheIsExplainingDatesToUs {
    public static void main(String[] args) {
        //only dates
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        //specific date
        LocalDate ld2 = LocalDate.of(1991, 6,9);
        System.out.println(ld2);
        //only time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalTime lt2 = LocalTime.of(11,49);
        System.out.println(lt2);
        //date and time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime.of(ld2, lt2);
        LocalDateTime ldt2 = LocalDateTime.of(1990, 4,23, 5, 6, 7, 8);
        System.out.println(ldt2);

        //lets do some calculations
        //you need to capture the result of the calculation
        //because it doesnt change the variable you call the
        //operation on (like the String class)
        lt.plusHours(1);
        ldt2 = ldt2.plusMonths(2);
        ldt2 = ldt2.plusDays(60);
        ldt2 = ldt2.plusWeeks(2);
        System.out.println(ldt2);

        //small exercise
        //create your date of birth
        //your time of birth
        //create the ldt using both

        //formatting
        LocalDate today = LocalDate.now();

        String formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("LONG format: " + formattedDate);

        formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("MEDIUM format: " + formattedDate);

        formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("SHORT format: " + formattedDate);

        formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("FULL format: " + formattedDate);
    }
}
