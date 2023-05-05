package com.nandan.interfaces.extendDemo2;

public interface A {

    // static interface method should have a body
    // and they should be called by interface name
    static void greeting()
    {
        System.out.println("i m satic");
    }

    default void fun(){
       System.out.println("I am in A");
   }

}
