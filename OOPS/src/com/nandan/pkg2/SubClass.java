package com.nandan.pkg2;

import com.nandan.access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj  =new SubClass(45,"fghgf");
        int n = obj.num;

     // thorws error because only sub lcass in aonther package  can access it
        // because if it was true A's obj canbe created any where as A dont have knowledge of its sub class  so violating data hiding but a sublaccss knows it parent so prtectedd can only be used by sublasss obj

//        A obj2 = new SubClass(74,"hhjg");
//        int n = obj2.num;



    }
}
