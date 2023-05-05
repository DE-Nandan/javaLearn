package com.nandan.abstaractDemo;

// cannot be final as final cannot be inherited and abstract class need to be inherited
public abstract class Parent {

    final int VAL;

    public Parent(int age) {

        VAL = 156;
        this.age = age;
    }

    int age;


     // Abstract constructors not allowed
    //abstract Parent();

    static void hello()
    {
        System.out.println("Hello");
    }
    void normal()
    {
        System.out.println("A normal method");
    }
    abstract  void career();
    abstract  void partner();
}
