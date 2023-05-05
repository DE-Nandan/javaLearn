package com.nandan.interfaces.extendDemo2;

public class Main implements A , B {


   // in case of ovverriding the acces method should be less strict or equal
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj  = new Main();
        A.greeting();
    }
}
