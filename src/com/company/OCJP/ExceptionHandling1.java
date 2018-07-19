package com.company.OCJP;

/*
* while handling exception always remember that if
* you calling a method which throws exception,
* make sure u add throws exception to the function
* which calls it.
* For eg, in below example, line m1()
* throws exception if u remove the "throws exception"
* from main.
*
*
* */


public class ExceptionHandling1 {
    public static void main(String[] args) throws Exception{
        m1();
    }

    private static void m1() throws Exception{
        System.out.println("Hi");
    }
}
