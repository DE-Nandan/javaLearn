package com.nandan.interfaces.nested;

public class A {
    // nested interface
    // nested interface can be declared public private or protected but top lvl interface has to be declared public or default one
    public interface  NestedInterface{
        boolean isOdd(int num);
    }
}

class  B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return  (num&1) == 1;
    }
}

