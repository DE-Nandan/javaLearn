package com.nandan.enumExamples;

public class Basic {
 enum Week implements A{
     Monday , Tuesday , Wed ,Thur ,Fri ,Sat ,Sun;
     // these are enum constant

     // public static and final members
     // since it is final you can create child enums
     // type is Week


     Week()
     {
         System.out.println("const called for "+ this);
     }

     @Override
     public void hello() {
         System.out.println("hey how are u");
     }
     // this is not public or protected
     // why? -
     // we dont want to create new obj
     // bcz this is not enum concept

     // internally: pulic static final Week Monday = new Week();

     // all enum extends ljava.lang.enum class
     // so it cannot extend any other class
     // cannot be super calss either
     // tostring methodas are overriden
     // can implement iterfaces but cant extend class
     // abstract method not allowed
 }

    public static void main(String[] args) {
        Week week;
        week = Week.Fri;

        week.hello();

        // it is returning a enum constant
        System.out.println(Week.valueOf("Monday"));

//        for(Week day : Week.values())
//        {
//            System.out.println(day);
//        }
       // System.out.println(week.ordinal());
    }
}
