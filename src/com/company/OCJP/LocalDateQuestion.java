package com.company.OCJP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateQuestion {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MIN;
        System.out.println(time);
        System.out.println(date.atTime(time));
        LocalTime time2 = LocalTime.MAX;
        System.out.println(date.atTime(time2));

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());
    }
}
