package com.company.OCJP;

public class testCasting {

    private static void takeInt(int i){
        System.out.println("Int version: "+i);
    }

    private static void takeChar(char x){
        System.out.println("Char version: ");
    }
    public static void main(String[] args) {
        int i = '5';
        System.out.println("value of i: "+i);
        takeInt(i);
        takeChar('5');

    }
}
