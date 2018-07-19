package com.company.OCJP;

public class SwitchCaseTest {
    public static void main(String[] args) {
        char var = 7; // whatever u put here should be exactly matched with the case argument.
        //'7' and 7 are different.
        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
