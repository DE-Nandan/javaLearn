import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        * GitHub Text Files (NOTES) :https://www.youtube.com/watch?v=BSVKUk58K6U&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=37
        */

        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students : {roo no , name , marks}
        // it would require a class
        /*
        * Class is a named group of property and functions
        * Objects are stored in heap memory and reference variables in stack memory
        * Variables that defines an object are reference varaibles and the varables inside an obect or the class are instance variables
        * In ordered to create objects we need to use new opeartor
        * */

        //object creation

        //Student[] students = new Student[5];
       // System.out.println(Arrays.toString(students));

        /*
        * By default values of objects are null in JAVA
        * For primitve it might be differnrt ?
        * While creating obejcts Dynamically allocates memory and returns a reference to it and that reference is stored in refernce variable
        * Dynamic memory allocation :
           Student s1 = new Student()
           LHS :(happens at compile time)
           RHS : (happens at runtime)
           So when memory is allocated at runtime it is dynamic memory allocation
        * Reference varables are stored in stack and they point to heap memory
        *
        *
        * */

       // st1 is refence var pointing to an object (i.e it holds  an address of original object that is in the heap)
       // you cannot memmory address in java it is not allow  , in java you cannot manupulate references but in c/c++ we can
       // we cannot cause an object ref to point to an arbittary memory location or manupulate it
        // new basically does dynamic memory allocation

        Student st1;
        st1 = new Student("nandan",15,90);


       // by default value of primitve datatypes vary but of objects are null
       // System.out.println(st1.name);
//        st1.rno = 15;
//        st1.marks = 89;
//        st1.name = "Nandan";
       // System.out.println(st1.rno);


        /*
        * Constructor : A function that runs when an objecyt is creates and is used for allocating variables
        * this basically generalise the object and while functioning it retrieves the objects varaible
           this.var1 = x
           this.var2 = y
        * */


       //st1.changeName("kumar");
        // st1.greeting();

       // System.out.println(st1.name);

        Student s1 = new Student("nandan",15,98);
        Student s2 = new Student(s1);

        System.out.println(s2.name);

    }

    // create a class

   static class Student{
        int rno;
        String name;
        float marks;

        void greeting()
        {
            System.out.println("My name is "+ this.name);
        }

        void changeName(String newName)
        {
            name = newName;
        }
        Student ()
        {
            this.rno = 15;
            this.marks = 89;
            this.name = "Nandan";
        }

        Student (Student other)
        {
           // basically this keyword is pointing to the obects varable to separate it from parameter varables
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

       Student (String name,int rno,float marks)
       {
           this.rno = rno;
           this.marks = marks;
           this.name = name;
       }
    }
}