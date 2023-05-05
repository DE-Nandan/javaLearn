package com.nandan.cloning;

// just telling jvm that we have to perfomr clone on our obj s it doesnot have abastract method
public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,5,6,6};
    }

//    public Human(Human other)
//    {
//        this.age = other.age;
//        this.name = other.name;
//    }


    //inside Object , overrding
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//       // this is shallow copy
//        return super.clone();
//    }


    @Override
    public Object clone() throws CloneNotSupportedException{
       // this is deep copy
       Human twin = (Human) super.clone(); // this is actually shallow copy

        // make deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
          twin.arr[i] =this.arr[i];
        }
        return  twin;
    }
}
