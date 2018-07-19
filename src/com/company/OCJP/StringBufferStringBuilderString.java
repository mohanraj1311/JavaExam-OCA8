package com.company.OCJP;

/*
* When you say "String is immutable in java, it means it cant be modified in place.
* StringBuffer is mutable, meaning any change on actual stringbuffer can take inplace
* and gets reflected throughout.
* StringBuilder is exactly like StringBuffer.
* But stringBuilder is fast because its not thread-safe.
* By thread-safe we mean it cant be accessed by 2 threads simultaneously.
*
* */


public class StringBufferStringBuilderString {
    public static void main(String[] args) {
        System.out.println("=======STRING=================");
        String str = new String("Hi");
        String str2 = str.replace('i', 'h');
        System.out.println("str: "+str+" str2: "+str2);
        System.out.println("======STRING BUFFER===========");
        StringBuffer stringBuffer = new StringBuffer("Hi");
        stringBuffer.append('a');
        System.out.println("stringBuffer: "+stringBuffer);
        System.out.println("======STRING BUILDER===========");
        StringBuilder stringBuilder = new StringBuilder("Hi");
        stringBuilder.append('z');
        System.out.println("stringBuilder: "+stringBuilder);



    }
}
