package com.nandan.abstaractDemo;

public class Daughter extends Parent{

    public Daughter(int age)
    {
        super(age);

        this.age = age;
    }
    @Override
    void career() {
        System.out.println("I am going to be a Teacher");
    }

    @Override
    void partner() {
        System.out.println("I lv gb");
    }
}
