//package contain classes
package com.denandan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World\n");
        /*
        variables are containers which store data values
        String int float char boolean
        */

//        int a = 45;
//        String s = "nadnan";
//        System.out.println(a + " " + s);

        /*
        string in a non primitive datatype
        we can tun methods of non primitive data type

        No need to free memory in java garbage collector does it all
        */

        //Input
        //System.in means we want to take input from keyboard
        // which means we want to take input from input stream
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        System.out.println(input);
//        int input2 = scan.nextInt();
//        System.out.println(input2);
//
//        if(input2 > 5)
//        {
//            System.out.println("dfgd iodg");
//        }
//
//        if(input.equals("Nandan"))
//        {
//            System.out.println("fgdfg");
//        }


//        int marks[] = {1,56,6,65,};
//        System.out.println(marks[3]);
//
//        for (int i  = 0 ;  i < marks.length ; i++)
//        {
//            System.out.print(marks[i]+" ");
//        }
//        System.out.println();
//    }


        // Try Catch


//        int[] arr = new int[10];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = scan.nextInt();
//
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        try{
//            System.out.println(arr[11]);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
/*******************************************************/
/*******************************************************/

//Environment varaibles are basically a collection of folders where the system check whether the written file name in terminal exists as executable


       // System.out.println();
/*
* System has a variable out of type print stream and out has method println
* initially out is null i.e it prints to cmd line
* */


       Scanner input  =new Scanner(System.in);
/*

* System.in is default system input which can be changed for eg to file input stream
* Scanner is a class that allows us to take input
* */

      //  System.out.println(input.next());

//        System.out.println(input.nextInt());
//        input.nextLine();
//
//        System.out.println(input.nextLine());
//
//        int roll  = input.nextInt();
//        System.out.println("gdegderg "+roll );


        /********Type casting*********/

         float num1 = input.nextFloat();
         int numc = (int)num1;
        System.out.println(numc);

        byte numb = (byte)numc; // numc%256

        System.out.println(numb);

        // java is unicode language

/**Variable length arguments***********/
     fun("dfggdhgh","Gfhsdhsd","gfgfhsfh");
 // variable length agruments should come at end only

    }

    static  void fun(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
