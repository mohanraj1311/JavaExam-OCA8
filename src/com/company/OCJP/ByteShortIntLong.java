package com.company.OCJP;

//Bytes supports only from -128 to 127
//short supports only from -32786 to 32787
//Other primitive types in Java
//int,
//long,
//float,
//double,
//boolean
//char


public class ByteShortIntLong {
    public static void main(String[] args) {
        byte var = 100;
        switch(var){
            case 100:
                System.out.println("var is 100");
                break;
            case 127:
                System.out.println("var is 200");
                break;
             default:
                 System.out.println("in default");
        }
    }
}
