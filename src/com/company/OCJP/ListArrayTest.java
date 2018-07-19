package com.company.OCJP;

import java.util.ArrayList;
import java.util.List;

public class ListArrayTest {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove('O');// This will throw Exception, as we try to remove index 79.
            // 79 comes by the ascii value of 'O'.
        }

        for(char ch : list) {
            System.out.print(ch);
        }
    }
}
