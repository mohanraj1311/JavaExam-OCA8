/*
* Every tertiary operation should have ? and then :
*
*
*
* */


package com.company.OCJP;

import java.time.LocalTime;

public class TertiaryOperators {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16,40);
        String amPm = time.getHour()>=12?"PM":"AM";
    }

}
