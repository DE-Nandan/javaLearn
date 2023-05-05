package com.nandan.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b =0;
        try{
         //   divide(a,b);
            // mimicing an exception
            String name = "nandan";
            if(name.equals("nandan"))
            throw  new MyException("My name is nandan");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
           // here we see parent class as ref
            // and obj e as being refernced by it
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
           //if it is placed above arithmaticExcetion then it will give error as if more strict exception is handled no need to declare subcalss exception
            System.out.println("normal Exception");
        }
        finally {
            // runs in any case
            System.out.println("this will go");
        }

    }
    static int divide(int a,int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw  new ArithmeticException("please do not divide by 0");
        }
        return  a/b;
    }
}
