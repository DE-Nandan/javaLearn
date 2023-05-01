package com.nandan.staticExample;
// this is a demo to show initialisation of static varables
public class staticBlock {
    static  int a = 4;
    static  int b;
    // will only run one when the first obj is created when the classs is loaded for the first time
    static {
        System.out.println("statci block");
        b = a*5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);


        staticBlock.b += 3;
        // if static block would have run again then the val of b should be changed to 20 again but it does not
         staticBlock obj2 = new staticBlock();
;
        System.out.println(staticBlock.a + " " + staticBlock.b);}
}
