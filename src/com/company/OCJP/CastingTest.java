package com.company.OCJP;

public class CastingTest {

    public static void main(String[] args) {
        Object obj = new Object();
        String s = "Hi";
        obj = s;
        String s2 = (String) obj;
        System.out.println(s2);
    }
}
