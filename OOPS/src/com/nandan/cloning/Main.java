package com.nandan.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human nandan = new Human(22,"nandan");
    //    Human twin  =new Human(nandan);

        // an easier and faster way to copy
        Human twin = (Human) nandan.clone();

        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));


        twin.arr[0]  =100;
       // nandan.arr also changed
        // shallow copy :
      //  primitives will be copied as it is but in case of obj ref var point to same obj
        /* clone creates exact copy of primitives by creating new varaible
        * but int case of obj it simply points not cerate a new copy
        *
        * Deep Copy:
        * new obj created
        * */
       System.out.println(Arrays.toString(nandan.arr));
       System.out.println(Arrays.toString(twin.arr));
    }
}
