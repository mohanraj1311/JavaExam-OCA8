/*
* Clone results in shallow copy.
* Shallow copy is when copied entity or the clone is not completely independent of the
* original entity.
* Any change in the original will get reflected in the clone.
* */

package com.company.OCJP;

import java.util.ArrayList;

class Counter{
    int counter;
    public Counter(int counter){
        this.counter = counter;
    }

    public String toString(){
        return ("Counter- "+this.counter);
    }
}

public class CloneUsageAndShallCopying {

    public static void main(String[] args) {
        ArrayList<Counter> list = new ArrayList<>();
        list.add(new Counter(10));

        ArrayList<Counter> dup = (ArrayList<Counter>)list.clone();
        dup.get(0).counter=5;

        System.out.println(list);

        list.get(0).counter = 15;
        System.out.println(dup);

    }


}
