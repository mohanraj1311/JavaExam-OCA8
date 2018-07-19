package com.company.OCJP;

public class DoubleCheck {
    static Integer[] integers = new Integer[2];
    static int[] ints = new int[2];

    public static void testInts(Integer[] integers, int[] ints){
        System.out.println(2+integers[0]);

        System.out.println(ints[0]);

    }



    public static void main(String[] args) {
        double d1 = 1.2f;
        float f1 = 1;
        long l1 = 200L;
        System.out.println(f1+" "+d1 +" "+l1);
        StringBuffer sb = new StringBuffer();
        sb.append("Java");
        System.out.println(sb.toString());
        testInts(integers, ints);


    }
}
