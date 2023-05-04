package com.nandan.properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    // overrding the toString method of parent class i.e Object class
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
       // actually println check toString method of class if it not present then it calls toAString method of Object class  (A class which is inherited by all classes)
        System.out.println(obj);
    }
}
