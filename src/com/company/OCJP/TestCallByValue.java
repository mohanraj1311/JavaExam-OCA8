package com.company.OCJP;

class Stud {
    String name;
    int marks;

    Stud(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}


public class TestCallByValue {
    public static void main(String[] args) {
        Stud stud = new Stud("James", 25);
        int marks = 25;
        review(stud, marks);
        System.out.println(marks + "-" + stud.marks);
    }

    private static void review(Stud stud, int marks) {
        marks = marks + 10;
        stud.marks+=marks;
    }

}
