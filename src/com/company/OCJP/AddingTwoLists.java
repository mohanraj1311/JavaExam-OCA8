package com.company.OCJP;
/*
* addAll method shall add the collection as in the list2
* at a specified index as in 1.
* So, the list becomes [A, B, C, D]
*
* */
import java.util.ArrayList;
import java.util.List;

public class AddingTwoLists {
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('D');
        List<Character> list2 = new ArrayList<>();
        list2.add('B');
        list2.add('C');
        list1.addAll(1,list2);

        System.out.println(list1);
    }
}
