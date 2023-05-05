package com.nandan.abstaractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.normal();
        Daughter daughter = new Daughter(28);
        daughter.career();

       // Objects of abstract class cannot be created
       // you need to inmplemnet methods while creating

        // But hey can be used as a reference varaible
        Parent daugh = new Daughter(89);
        // as which func to be accesd is determined by the type of obj and what is acces depends on refernce var

        // static methods cannot be defined abstract as static methods cnnot be overriden
        // Although there can be static methods in abstract clases

        Parent.hello();


    }
}
