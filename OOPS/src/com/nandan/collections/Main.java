package com.nandan.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
       /*
       * Differnce btw rray list and vector:
       * array list is accessed by many threads while in cse of vector only one threads access it while the other thread waits
       * Array li st is faster
       * */

        List<Integer> vec = new Vector<>();
        vec.add(45);
        vec.add(5);
        vec.add(15);
        vec.add(56);
    }
}
