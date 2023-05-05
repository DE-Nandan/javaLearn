package com.nandan.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student nandan =new Student(12,98f);
        Student rahul  =new Student(18,99.5f);
        Student arpit  =new Student(2,95.5f);
        Student karan  =new Student(5,89.5f);
        Student sachin  =new Student(16,91.5f);


        Student[] list ={nandan,rahul,arpit,karan,sachin};
        System.out.println(Arrays.toString(list));

        // descending orer sorting
        // lambda functions
        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks-o2.marks));
        // sorted if toCompare ovverrden
        System.out.println(Arrays.toString(list));

//        if(nandan.compareTo(rahul) < 0)
//        {
//            System.out.println("rahul more");
//            System.out.println(nandan.compareTo(rahul));
//        }
    }
}
