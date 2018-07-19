package com.company.OCJP;

//public - if no public , then it would get executed from outside, jvm has to access right.
//static - the jvm doesnt want to create a dedicated object for calling the main, so static is required.
//void - if no void, then the jvm shall return something which shall be different for different platform, creating
//all issues.
//main - main is the entry point for the jvm, be carefull , its "main" and not "Main"

public class UsingPSVM {
     static public void main(String[] args) {
        System.out.println("hi");
    }
}
