package com.company.OCJP;

import java.time.LocalDate;
import java.time.Period;

public class testAssignment {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate xMas = LocalDate.of(2018, 1, 25);
        boolean flag1 = newYear.isAfter(xMas);
        boolean flag2 = newYear.isBefore(xMas);
        System.out.println("flag1: "+flag1+" && flag2: "+flag2);
        Period p = Period.of(0,0,10);
        System.out.println(p);

        String [] fruits = {"apple", "banana", "mango", "orange"};
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
            if(fruit.equals("mango")) {
                continue;
            }
            System.out.println("salad!");
            break;
        }



    }
}
