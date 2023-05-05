package com.nandan.interfaces;

public class Main {
    public static void main(String[] args) {
        //Engine car = new Car();

        //car.acc();
      //  car.start();
       // car.stop();

        // based on dynamic method dispatch
        // c/ar.();
        // two classes that are unrealted to each other can also implement the same interface
        // IN performace critical code interffaces should be avoided because it happens at  runtime

        //Media carMedia = new Car();
        //carMedia.stop();


        NiceCar car  = new NiceCar();
        car.start();
        car.startMusic();
        car.upEngine();
        car.start();

    }
}
