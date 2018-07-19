package com.company.OCJP;

class Message {
    static void main(String [] args) {
        System.out.println("Welcome! " + args[1]);
    }
}

public class TestMainMethods {
    public static void main(String [] args) {
        Message.main(args);
    }

}
