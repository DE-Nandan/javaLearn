package com.nandan.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("music start");
    }

    @Override
    public void stop() {
        System.out.println("music stop");
    }
}
