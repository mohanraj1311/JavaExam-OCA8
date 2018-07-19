package com.company.OCJP;

//This shall result in compilation error.
//it results in an exception called ConcurrentModificationException.
//It because the iterator loses the track of doing next since
//the program is removing some elements in the middle of
//the while loop.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModification {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<String>();
        dryFruits.add("Apple");
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> it = dryFruits.iterator();
        while(it.hasNext()){
            String dryFruit = it.next();
            if(dryFruit.startsWith("A")){
                dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);
    }
}
