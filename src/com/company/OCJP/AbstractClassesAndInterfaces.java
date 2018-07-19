/*
* if you are implementing an interface using an abstract class,
* you have the freedom of NOT implementing all the methods mentioned
* in the interface.
* The moment you have a concrete class, u have to make sure that u
* all the methods in the interface are implemented either by the concrete class
* itself or by the abtract class which was extended by the concrete class.
*
* Non-abstract classs or concrete class should NOT have any
* abstract method.
*
*
* */

package com.company.OCJP;

interface Printable {
    public void setMargin();
    public void setOrientation();
}

abstract class Paper implements Printable{
    public void setMargin(){

    }


}

class NewsPaper extends Paper{
    public void setOrientation(){

    }
}

public class AbstractClassesAndInterfaces {
}
