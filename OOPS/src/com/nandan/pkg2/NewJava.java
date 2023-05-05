package com.nandan.pkg2;

import com.nandan.access.A;

import static com.nandan.packages.a.Message.message;

public class NewJava {
    public static void main(String[] args) {
        message();

        A a =new A(10,"fdg");
        System.out.println(a.getNum());
       // int n = a.num;

    }
}
