package com.company.OCJP;

/*
* remove method takes in the index as argument,
* it doesnt take the element itself.
* Below example shall throw runtime exception
* of IndexOutOfBoundException.
* Line 21 shall result in arrayOutOfBoundException
* */


import java.util.ArrayList;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(100);
        list.remove(100);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);
        list2.add(0);
        list2.remove(list2.indexOf(0));
        System.out.println(list2);
    }
}
