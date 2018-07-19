package com.company.OCJP;

class Pen {

    String name;
    public Pen(String pName){
        this.name = pName;
    }

    protected void finalize() throws Throwable{
        System.out.println("Object garbage collected: "+this.name);

    }

}

public class TestGarbageCollection {
    public static void main(String[] args) {
        new Pen("Anonymous Pen"); //Line 1
        Pen p = new Pen("Normal Pen"); // Line 2
        change(p); //Line 3
        System.out.println("About to end."); //Line 4
        System.gc();
    }

    public static void change(Pen pen) { //Line 5
        pen = new Pen("Changing the Pen"); //Line 6
    }


}
