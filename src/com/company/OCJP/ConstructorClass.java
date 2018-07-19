package com.company.OCJP;

class Student1{
    String name;
    int age;

    Student1(){

    }

    void Student1(){
        Student1("James", 25);
    }

    void Student1(String name, int age){
        this.name = name;
        this.age = age;
    }

}

public class ConstructorClass {
    public static void main(String[] args) {
        Student1 s = new Student1();
        System.out.println(s.name+" : "+s.age);


        s.Student1();
        System.out.println(s.name+" : "+s.age);

        s.Student1("raj", 24);
        System.out.println(s.name+" : "+s.age);
    }
}
