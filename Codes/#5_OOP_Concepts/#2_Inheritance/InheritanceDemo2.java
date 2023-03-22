
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
    Summary:
    --------
    -> In the parent class if the parameterized constructor is defined but, default constructor is not defined, it results in
       a compilation error.
    -> This error can be resolved in the following 2 ways:
       1. Define the default constructor in parent class.
       2. Manually call the parent class parametrized constructor in child class default and/or parameterized constructor  
          using "super" keyword.    
*/

class Demo1
{
    //Default constructor is defined to prevent compilation error.
    Demo1()
    {
        System.out.println("Demo1 Default Constructor");
    }

    Demo1(String text)
    {
        System.out.println("Demo1 Parameterized Constructor");
    }
}

class Demo2
{
    Demo2(String text)
    {
        System.out.println("Demo2 Parameterized Constructor");
    }
}

class ChildDemo1 extends Demo1
{
    ChildDemo1()
    {
        //super(); // Explicit calling of default parent constructor not required.
        System.out.println("ChildDemo1 Default Constructor");
    }

    ChildDemo1(String text)
    {
        System.out.println("ChildDemo1 Parameterized Constructor");
    }
}

class ChildDemo2 extends Demo2
{
    ChildDemo2()
    {
        /*  
           As parent class default constructor is not defined, parent class parameterized constructor is called 
           through "super" keyword just to prevent compilation error.
        */
        super(null); 
        System.out.println("ChildDemo2 Default Constructor");
    }

    ChildDemo2(String text)
    {
        /*  
           As parent class default constructor is not defined, parent class parameterized constructor is called 
           through "super" keyword just to prevent compilation error.
        */
        super(null);
        System.out.println("ChildDemo2 Parameterized Constructor");
    }
}


public class InheritanceDemo2 {
    public static void main(String[] args) {

        System.out.println("\n\nCalling ChildDemo1 Constructors:");
        System.out.println("--------------------------------\n\n");

        new ChildDemo1(); // Orphan Object

        System.out.println("\n\n");

        new ChildDemo1(null); // Orphan Object

        System.out.println("\n\nCalling ChildDemo2 Constructors:");
        System.out.println("--------------------------------\n\n");

        new ChildDemo2(); // Orphan Object

        System.out.println("\n\n");

        new ChildDemo2(null); // Orphan Object

        System.out.println("\n\n");
    }
}
