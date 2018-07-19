package com.company.OCJP;


//if a variable is initialized only
//in conditional statements then there is a chance
//that the variable is never initialized, so accessing that
//would result in compilation error.
//So, if model is not initialized here as test, and we do a
//print model, model will show a comilation error.


public class Initialization {
    public static void main(String[] args) {
        double price = 100000;
        String model="test";
        if (price > 100000){
            model = "Model s";
        } else if(price <=100000){
            model = "model x";
        }
        System.out.println(model);
    }
}
