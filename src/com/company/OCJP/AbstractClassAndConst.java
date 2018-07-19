package com.company.OCJP;

/*
* When you extend a class, and then you create a constructor
*of a subclass, whenever the constructor of the subclass is invoked, the first
* statement shall always be the innocation of the super class.
*
* */

abstract class Animal{
    private String name;
    Animal(){
        System.out.println("I am called ");
    }

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Dog extends Animal{
    private String breed;
    Dog(String breed){
        //The first statement here is always the super()
        //super();
        this.breed = breed;
    }
    Dog(String name, String breed){
        //super(name);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }
}

public class AbstractClassAndConst {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName()+ ":"+dog1.getBreed());
    }
}
