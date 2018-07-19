package com.company.OCJP;

import java.util.ArrayList;
import java.util.List;

public class StringIsNonMutable {
    public static void main(String[] args) {
        String s = "Hello";
        List<String> words = new ArrayList<>();
        words.add(s);
        words.add(new String("Hello"));
        words.add(s);
        s.replace('l', 'L');
        System.out.println(words);
    }
}
