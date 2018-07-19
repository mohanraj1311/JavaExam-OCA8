package com.company.OCJP;
/*
* if double or float are not initialized then they are by default initialized to 0.0.
* char by default gets initialized to something like ''
*
* double is primitive type, if its array initialized then each element gets initialised as 0.0.
* But "Double" is a class, so each element in Double[] gets initialized as null, not 0.0
* */


public class PrimitiveTypes {
    char c;
    double d;
    float f;

    public static void main(String[] args) {
        PrimitiveTypes obj = new PrimitiveTypes();
        System.out.println(">"+obj.c);
        System.out.println(">"+obj.d);
        System.out.println(">"+obj.f);
        System.out.println("--------------------");

        Double[] arr = new Double[2];
        //System.out.println(arr[0]+arr[1]); // This will throw runtime exception as we try to add null values
        double[] arrDouble = new double[2];
        System.out.println(arrDouble[0]+arrDouble[1]);
        System.out.println("--------------------");

        Character[] arrChar = new Character[2];
        System.out.println(arrChar[0]);
        System.out.println("--------------------");

        char[] arrchar = new char[2];
        System.out.println(arrchar[0]);
        System.out.println("--------------------");

        int[] arrInt = new int[2];
        System.out.println(arrInt[0]+arrInt[1]);
        System.out.println("--------------------");

        Integer[] test = new Integer[2];
        System.out.println(test[0]+test[1]);

    }
}
