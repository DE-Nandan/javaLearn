package com.nandan.interfaces;

public class ElectricEngine implements  Engine{

    @Override
    public void start() {
        System.out.println("Elec Engine startts");
    }

    @Override
    public void stop() {
        System.out.println("Elec Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Elec Engine accc");
    }
}
