package com.nandan.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape =new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

       // shape.area();
      //  circle.area();

        // it calls the square area  because simply squares area is overrding the area of shapes but if  area in square is missing it will give error because methods depends upon the refrencing varalbe  properties it is oveeriden thats why square area is called
        square.area();


        /*
        * Types Of Polymorphism:
        *1.Compile Time / Static : Achieved via method overloading (smae name of methods but types , arguments ,return types , ordering can be differenct )
        * Ex : Multiple Constructors
        * A a = new A();
        * A a = new A(3,4);
        *
        * 2. Runtime Polymorphism / Dynamic Polymorhpism:
        * Achieved by method overriding
        * Overriding : Simply when a same method exists in both parent ans sub class then he priroty is given to the sub class method
        * OR
        * if the type of ref var is parent class but the obj is of type sublcass , then which particular method will be called will depend upon the object
        *
        * Par obj = new Child()
        * which method will be called depends on Child()
        * this is known as Upcasting
        * And this entire thing is working of overriding
        *
        * How does java knwo which particular func will run?
        * Ans : Dynamic Method Dispatch : A mech by which a call to a a ovverriden method is resolve at runtime rather than at complile time
        *
        * final: if you put a method final then you cannot overeride that method , so at runtime it take less time to check is there any method overrding it , you can also use it to preventing inheritance
        * When you define a class final then all its method are declared final too
        *
        * Overriding : Late Binding (At runtime)
        * final : Early Binding (At compile time)
        * Both overlaoding and overrding does not apply to instace varaibles
        * */
    }
}
