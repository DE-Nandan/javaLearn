package com.nandan.interfaces;

public class PowerEngine  implements  Engine{
    @Override
    public void start() {
        System.out.println("Power Eng start");
    }

    @Override
    public void stop() {
        System.out.println("Power Eng stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Eng acc");
    }
}
