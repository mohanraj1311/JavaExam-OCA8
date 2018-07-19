package com.company.OCJP;


class SpecialString{
    String str;
    SpecialString(String str){
        this.str = str;
    }
//    @Override
//    public String toString(){
//        return this.str;
//    }
}

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println("s1.equals(s2):"+s1.equals(s2));
        System.out.println("s1==s2:dd"+s1==s2);
        System.out.println("s1==\"java\":"+s1=="java");
        System.out.println("s1.equals(\"java\"):"+s1.equals("java"));

        String s3 = "test";
        String s4 = s3;
        System.out.println(s3==s4);

        System.out.println("============================");
        System.out.println(new String("Java")); //
        System.out.println(new StringBuilder("Java"));
        // The above sout statemenet shall print "Java" because the toString method gets called
        System.out.println(new SpecialString("Java"));
        // The above sout doesnt print "java" because there is no default "toString" method in the class.


        System.out.println("============================");
        String str = "java";
        String str1 = new String("java");
        StringBuilder stringBuilder = new StringBuilder("java");
        StringBuilder stringBuilder1 = new StringBuilder("java");
        System.out.println(str.equals(str1) + ":" + str.equals(str1));
        System.out.println(stringBuilder.equals(stringBuilder1) + ":" + stringBuilder.equals(stringBuilder1));
        //stringBuilder doesnt override the equal method
        System.out.println(stringBuilder1.toString().equals(stringBuilder.toString()));
    }
}
