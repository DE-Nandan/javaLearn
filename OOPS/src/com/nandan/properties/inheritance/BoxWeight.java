package com.nandan.properties.inheritance;

public class BoxWeight extends Box {
   double weight;



   public BoxWeight()
   {
       this.weight = -1;
   }

   BoxWeight (BoxWeight other)
   {
       super(other);
       // when it goes to super class then other obj can access propeties of Box class only
       weight = other.weight;
   }



    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// what is this ? -> Call the parent class constructor
        // used to initialise values present in parent class
        /*
        * Every class in inheriting from object clas
        *  super();
        *  Super Keyword: 1.super points to the classs directly above it ,it calss the constructor of super class
        * 2.It can be used to refer to super class varibles
        * */

        System.out.println(super.h);
        System.out.println(this.w); // works too
        // but if both super and derived clas have same key word then use super keyword
        this.weight = weight;
        // Cannot initialse super class after base clas
        //super(l,h,w); gives err
        // if super is not used then default constructor will be called
    }
}
