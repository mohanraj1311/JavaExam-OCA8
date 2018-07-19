package com.company.OCJP;
/*
* If you are catching an sub-exception like FileNOtFound , catch
* it with IOException which is the superclass of FileNotFound.
*
*
* */


import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super{
    public abstract void m1() throws IOException;
}

class Sub extends Super{
    public void m1() throws IOException{
        throw new FileNotFoundException();
    }
}

public class ExceptionHandling2 {
    public static void main(String[] args){
        Super s = new Sub();
        try{
            s.m1(); // This doesnt compile if u just catch the FileNotFound
        } catch (IOException e){
        //} catch (FileNotFoundException e){ // This cant compile.Catch with the super exception
            System.out.println("M");
        } finally {
            System.out.println("N");
        }
    }
}
