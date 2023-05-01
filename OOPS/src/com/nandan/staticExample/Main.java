package com.nandan.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human nandan = new Human(15, "nandan", 8945644, false);
//        Human rahul = new Human(15, "rahul", 89465465, true);
//
//
//        System.out.println(nandan.population);
//        System.out.println(rahul.population);
//        // here also use it via class name instead by obj name
//        System.out.println(Human.population);
//        System.out.println(Human.population);

       // greeting();
        /*
        without using static in greeting function declaration it gives error because we cannot acces any method insie a static method that is non static

        *Static method can only access static data
         */



        /*
        * if you are calling a n function from static
        * then make sure you are creating an object of it
        * And if you are calling non static func from non static fun then no need to create obj as an obj wil be creaaed for outer non satic obviosly
        *
        *
        * */

        Main obj = new Main();
        obj.fun2();


        //SingletonClass obj2 = new SingletonClass();
        SingletonClass chk1 = SingletonClass.getInstance();
        SingletonClass chk2 = SingletonClass.getInstance();
        SingletonClass chk3 = SingletonClass.getInstance();


        // all 3 obj ref var pointing to just one obj

    }
    // thos is not dependednt upon object
    // thos does not belongs to an instacne
    static void fun()
    {


        //  greeting(); // you can use thois bcz it requres an instance  but the functino you are using it in does ont depend uppon instance
        // because it contradicts the statment that fin is tatic bcz on the on=her hand greeting isno static
/**************************/

        // now we can access non static in static
        // you cannot acces no static stuffs without referncing their instances in a static context
        // hence we are reference it
        Main obj = new Main();
        obj.greeting();
    }
    // we know that somethoing that is not static belongs to an object
    // this does not belongs to an instance

    void fun2()
    {
        // works good
        // bcz when we call fun2 using an obj then greeting will also be bound to that obj
        greeting();
    }

    void greeting()
    {
        // this is fine
       // fun();

        System.out.println("gellrt");
    }
}

