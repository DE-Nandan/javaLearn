package com.nandan.properties.polymorphism;

public class Circle  extends Shapes{
    // this will run when obj of cicrcle is created hence it is overriding the parent method
    @Override // this is annotation
    void area()
    {
        System.out.println("area is pi.r.r");
    }
}
