package com.nandan.properties.polymorphism;

public class Numbers {
    int sum(int a, int b)
    {
        return  a+b;
    }
    int sum (int a , int b ,int x)
    {
        return a+b+x;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,3);

        obj.sum(2,3,5);
      //  obj.sum(2,3,5,5);
        // type conversion is used in case compatible type is not found conversion is based on rules only
    }
}
