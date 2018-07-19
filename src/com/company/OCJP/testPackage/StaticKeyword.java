package com.company.OCJP.testPackage;

/*
* Static blocks are executed before the main is called.
* Things to remember:
* 1. static block gets executed when the class gets loaded
* 2. static block cant access any instance variables, it can access only the static variables.
* ===================
* Order of execution:
* ===================
* Static data members (if any) are created.
* Static blocks (if defined) are executed.
* The task that results in class loading is performed.
* Main method is callled.
*
* */

public class StaticKeyword {

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
    static {
        System.out.println(1);
        System.out.println(1/0); //1/0 throws runtime exception
    }


}
