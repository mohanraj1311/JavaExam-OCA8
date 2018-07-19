package com.company.OCJP;

import java.time.LocalDate;
import java.time.Period;

public class UpCastDownCast {
    public static void main(String[] args) {
        A obj1 = new B();
        B obj2 = (B) obj1; //Downcast

        B obj3 = new B();
        A obj4 = (A) obj3; //upcast

        A obj5 = new A();
        //B obj6 = (B) obj5;
        // The above is wrong downcast, will result in classCastException, becoz u r cutting down on A,
        // making the bigger A fit inside the smaller B.

        //Object obj = new Object();
        //String s = "Hi";
        //obj = s;
        //String s2 = (String) obj;
        //System.out.println(s2);
        LocalDate date = LocalDate.of(2020, 9, 30);
        System.out.println(date);

        Period period = Period.of(10, 10, 0);
        System.out.println(period);

        Period period2 = Period.of(10, 0, 0);
        System.out.println(period2);

        Period period3 = Period.of(0, 0, 0);
        System.out.println(period3);

        double[] arrDouble = new double[2];
        System.out.println(arrDouble[0]+arrDouble[1]);

        Double[] arrDOUBLE = new Double[2];
        System.out.println(arrDOUBLE[0]);

    }
}
