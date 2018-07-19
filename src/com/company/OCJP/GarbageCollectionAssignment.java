package com.company.OCJP;

public class GarbageCollectionAssignment {
    String objName;
    public GarbageCollectionAssignment(String objName){
        this.objName = objName;
    }



    static void display(){
        GarbageCollectionAssignment obj2 = new GarbageCollectionAssignment("T2");
    }

    public static void main(String[] args) {
        GarbageCollectionAssignment obj1 = new GarbageCollectionAssignment("Obj1");
        GarbageCollectionAssignment obj2 = new GarbageCollectionAssignment("Obj2");

        obj1 = obj2;
        System.gc();

        GarbageCollectionAssignment obj3 = new GarbageCollectionAssignment("Obj3");
        obj3 = null;
        new GarbageCollectionAssignment("Obj4");
        Runtime.getRuntime().gc();
        System.gc();

    }

    protected void finalize() throws Throwable
    {
        System.out.println(this.objName+" is garbage collected");
    }
}
