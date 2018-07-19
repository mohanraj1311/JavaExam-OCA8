package com.company.OCJP;

public class Dog2 {
    String name;
    int weight;
    String breed;
    public Dog2(String name){
        //this.name = name;
        //breed = "husky";
        //weight = 30;

        //Dog(name, "husky");
        //new Dog(name, "husky"); //this compiles
        this(name, "husky"); // a call to this must be the first statement inside a constructor
        System.out.println("constructor 1");

    }

    public Dog2(String name, String breed){
//        this.name = name;
//        this.breed = breed;
//        weight = 30;
        this(name, breed, 30);
        System.out.println("constructor 2");

    }

    public Dog2(String name, String breed, int weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print(){
        System.out.println(name+" "+breed+" "+weight);
    }


}

class OverloadingCons{
    public static void main(String[] args) {
        Dog2 dog1 = new Dog2("Jimmy");
        dog1.print();
        Dog2 dog2 = new Dog2("Jimmy", "shepherd");
        dog2.print();
        Dog2 dog3 = new Dog2("Rex", "pomerian", 40);
        dog3.print();
    }
}
