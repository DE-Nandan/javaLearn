package com.nandan.staticExample;

// out side classes cannot be static
/*
* Bcz it is not itself depended on any other class
*
* */
public class InnerClasses {
    // only inner calses can be static
    static  class Test{
          String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return  name;
        }
    }

    public static void main(String[] args) {
        /*
        * Without declaring Test as static it gives error when Test is inside InnerCalls because Test needs an instance of the InnerClass to run and bcz of that main method thows erro but if we declare Test class outside Inner calss then it does not give error because now it does not reuire any instance or wehn we decvlare it as tatic the also it does not depend uppon any instyance
        * so when declared static it depends on the class itself not on its objects
        * Static methods does not depend on objects so they are not depend upon runtime they are compile time dependednt
        * */
        Test a = new Test("Nandnand");
       Test b = new Test("kumar");

       // when printing an object toString method will
        // check wheehr we have a toString method or not within the calss or  it will use the default to string
        // we can ooverride toString to give our own method
        System.out.println(a);
    }

}


