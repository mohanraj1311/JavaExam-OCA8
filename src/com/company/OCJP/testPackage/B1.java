package com.company.OCJP.testPackage;

/*
* protected : if a reference variable is declared protected, it can NOT
* be accessed by a class in another package.
*
* private: cant be accessed by any class other than the class its declared.
* Even if a class extends another class, the private variables wont be accessible.
*
* public : available across packages or any class which gets included.
* */



import com.company.OCJP.A1;
public class B1 extends A1{
    public void print(){
        A1 obj = new A1();
        System.out.println(obj.i1);
        //System.out.println(obj.i2);
        System.out.println(this.i2);
        System.out.println(super.i2);
    }

    public static void main(String[] args) {
        new B1().print();
    }
}
