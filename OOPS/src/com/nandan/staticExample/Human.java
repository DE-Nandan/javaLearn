package com.nandan.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    /*
    * Properties which are not related to any particular object are static
    * When a memeber is declared static then it can be accessed befire any of the object of clss is cerated
    they are not dependt on objects
    * We can dclare methods too as static
    * main method is static because it needs to be accesed without creating its object because it is the first thing that is execute in aa program
    * */

    static long population;


    static void message()
    {
        System.out.println("hellooooo");


        // obviosly as static does not need obj and this refers to obj only so a contradiction
        //System.out.println(this.age);
    }


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // for static variables generally class name is preferred
        Human.population +=1;
        Human.message();

    }
}
