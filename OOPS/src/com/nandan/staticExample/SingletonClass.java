package com.nandan.staticExample;

public class SingletonClass {
    // a class whose only 1 obj can be created
     private SingletonClass()
    {

    }

    private static  SingletonClass instance;

     public static SingletonClass getInstance()
     {
         // check wether 1 obj is created or not
         if(instance == null)
             instance = new SingletonClass();

         return  instance;
     }
}
