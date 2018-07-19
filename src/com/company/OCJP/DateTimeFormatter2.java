package com.company.OCJP;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeFormatter2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(formatter.format(date.minus(period)));
    }
}
