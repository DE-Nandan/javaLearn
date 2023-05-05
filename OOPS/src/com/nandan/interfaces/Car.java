package com.nandan.interfaces;

public class Car implements Engine , Brake ,Media{
    @Override
    public void brake() {
        System.out.println("Brake like n car");
    }

    @Override
    public void start() {
        System.out.println("Start E like n car");
    }

    @Override
    public void stop() {
        System.out.println("Stop E like n car");
    }

    @Override
    public void acc() {
        System.out.println("Acc like n car");
    }
}
