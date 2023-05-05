package com.nandan.generics;

import java.util.Arrays;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html

public class CustomGenericArrayList<T> {
    private  Object[] data;
    private  static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {

        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
      if(isFull())
      {
          resize();
      }
      data[size++] = num;
    }

    private boolean isFull() {
        return  size == data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length*2];

        // copy the items in the new array
          for (int i =  0; i < data.length ; i++)
          {
                temp[i] = data[i];
          }
          data =temp;

    }
    public T remove()
    {
        T removed = (T)data[--size];
        return  removed;
    }
    public T get(int index)
    {

        return  (T)data[index];
    }
    public int size()
    {

        return  size;
    }

    public void set(int index , T value)
    {

        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(5);
//        list.remove(0);
//        list.get(0);
//        list.set(1,54);
//        list.size();
//        list.isEmpty();


//        CustomGenericArrayList list =new CustomGenericArrayList()
//;
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list);

        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(i * 3);
        }
        System.out.println(list3);
    }
}
