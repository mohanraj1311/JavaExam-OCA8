package com.company.OCJP;

public class GarbageCollectionObjectCreationInsideMethod {
    String objName;
    public GarbageCollectionObjectCreationInsideMethod(String objName){
        this.objName = objName;
    }

    static void show(){
        GarbageCollectionObjectCreationInsideMethod obj1 = new GarbageCollectionObjectCreationInsideMethod("T1");
        display();
    }

    static void display(){
        GarbageCollectionObjectCreationInsideMethod obj2 = new GarbageCollectionObjectCreationInsideMethod("T2");
    }

    public static void main(String[] args) {
        show();
        System.gc();
    }

    protected void finalize() throws Throwable
    {
        System.out.println(this.objName+" is garbage collected");
    }
}
