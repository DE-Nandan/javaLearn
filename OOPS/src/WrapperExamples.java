public class WrapperExamples {


    public static void main(String[] args) {


        //  Integer a= new Integer(10);
        //  Integer b = new Integer(20);
        // not swapping although a and b are objects
        // bcz Integer Class is final : with the use of final you can prevent your content to be modified
        //swap(a,b);
        // change(a);

        //   System.out.println(a + '\n');

        int a = 5;

        System.out.println("Before changing: a = " + a);

        // Call changeValue function
        changeValue(a);

        System.out.println("After changing: a = " + a);


        // System.out.println(a+"   "+b);

        /*
         * Difference is it s cerated like an object
         * if we do num. we get may functinoalities
         * so Integer is an wrapper class
         * so a wrapper class convert a primitive into an object
         * When you pass an object it is passed by reference
         * But it s not swapeed in the finction
         * Final variables need to be initialised while declaring
         * finl guarantees immutabilty only when the instance var are primitive data type and not reference type of objects
         * eg final Student a = new Student()
         * a.name = "sfgg"  allowed
         * but a = b not allowed  , basically you cant reassgn it
         * */



        /*****************/

        /*
        * Garbage collection :
        * Finalize method will be called when java is doing garbage collection
        * */

        A obj;

        for (int i = 0; i < 1000000000; i++) {
              obj = new A("fgdfgdfg");
        }


    }



//    static void swap(Integer a , Integer b)
//    {
//        Integer temp = new Integer(a);
//        a = new Integer(b);
//        b = new Integer(temp);
//    }


//    static void change(Integer a)
//    {
//        a = 7;
//    }

    public static void changeValue(int x) {
        x = 10;
    }


}

class  A{
    String name;

    public A(String name)
    {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("do this\n");
        //super.finalize();
    }
}
