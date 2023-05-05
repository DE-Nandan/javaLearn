package com.nandan.abstaractDemo;

public class Son extends Parent{
    public Son(int age)
    {
        // this is the only way by which you can initialise final var of super calss
        super(age);

        this.age = age;
    }
    @Override
    void career() {
        System.out.println("I am going to be a Doc");
    }

    @Override
    void partner() {
        System.out.println("I lv gg");
    }

    @Override
    void normal() {

        super.normal();
    }
}
