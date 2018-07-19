package com.company.OCJP;
/*
* remember to put break after every option in switch statement
* or else each option of the switch statement after the first match shall get executed.
*
* */


public class switchStatement {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "mango":
                System.out.println("Mango2");
            case "Jackfruit":
                System.out.println("JackFruit1");
            case "Apple":
                System.out.println("APPLE");
            case "mango1":
                System.out.println("MANGO");
            case "Jackfruit2":
                System.out.println("JackFruit2");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }
}
