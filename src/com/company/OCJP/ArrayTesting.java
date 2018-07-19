package com.company.OCJP;

/*
* The method 'remove' accepts either the object reference or the index of the object which has to be removed.
* If its given an anonymous reference like : new Student("stud1, 25), it wont do anything but shall compile
* */

import java.util.ArrayList;
import java.util.List;

    class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Student[" + name + ", " + age + "]";
        }
    }

    public class ArrayTesting {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("James0", 25));
            students.add(new Student("James1", 27));
            students.add(new Student("James2", 25));
            students.add(new Student("James3", 25));
            Student student = new Student("raj", 30);
            students.add(student);
            for(Student stud : students) {
                System.out.println(stud);
            }


            students.remove(student);
            students.remove(1);
            students.remove(new Student("James2", 23));

            for(Student stud : students) {
                System.out.println(stud);
            }

            System.out.println("---some array--test");
            int [] arr = {2, 1, 0};
            //System.out.println(arr[0]);
            for(int i : arr) { // the i doesnt loop like 0,1,2 , its loops with objects - 2,1,0
                System.out.println(arr[i]);
            }

        }


    }

