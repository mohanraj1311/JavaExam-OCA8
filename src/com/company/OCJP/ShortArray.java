/*
* The main decs of array are ;
* short[] arr = new short[2];
* The one which doesnt work : short[] arr = new short[] => unlike python
* the size of the array is predefined for array in Java.
* The size of the arrayList need not be mentioned before.
* If you dont wish to mention the size, then directly initialise the array like
* => short[] arr = new arr[]{100,100}
*
*
* */


package com.company.OCJP;

public class ShortArray {
    public static void main(String[] args) {
        short[] arr = new short[]{100,100};
        arr[0]=5;
        arr[1]=10;
        System.out.println("[ "+arr[0]+", "+ arr[1]+" ]");
    }
}
