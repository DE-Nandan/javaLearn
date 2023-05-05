package com.nandan.access;

public class ObjectDemo {

    // toString basically gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }
    // finally gets called when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    int num;

     float gpa;

    public ObjectDemo(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // it basically gives an number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
       return this.num == ((ObjectDemo)obj).num;
        // return super.equals(obj);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(45,65f);
        ObjectDemo obj2 = new ObjectDemo(45,65f);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        // == check whether these to variables are pointing to same object or not
        // in this casae obviously not
        if(obj1 == obj2)
        {
            System.out.println("obj1 is equal to obj2");
        }

        // .euals checks the content of it
        if(obj1.equals(obj2))
        {
            System.out.println("obj1 is equal to obj2");
        }

    }


}
