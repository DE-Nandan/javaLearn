package com.nandan.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4,5,8);
//        Box box2 = new Box(box);
//
//        System.out.println(box2.l + " " + box2.w + " " +box2.h);


//         BoxWeight box3 = new BoxWeight();
//         BoxWeight box4 = new BoxWeight(5,5,6,8);
//        System.out.println(box3.weight + " " + box3.l);


      //  Box box5 = new BoxWeight(5,5,6,9);
        // it is basically the type of the reference varables and not the type of the object that determines what type of members can be accessed
      //  System.out.println(box5.w);

       // error
        // because ref var of type BoxWeight but obj is of type Box and Box does not know about varables of BoxWeight so it cannot initialse it hence throws an error
        //  BoxWeight box6 = new Box(5,5,6,9);



       // BoxPrice box = new BoxPrice();

        Box box =new BoxWeight();

        // not overriden by box weight method
        box.greeting();
        BoxPrice.greeting();
        /*
        * static methods are not overriden becasue they are same for all objects
        * Even though they can be inherited
        * static does not depend on objects whereas overrding depends upon objects so static cant be overriden
        * */




    }
}
