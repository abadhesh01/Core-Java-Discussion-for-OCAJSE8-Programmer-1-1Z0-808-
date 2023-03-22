
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class OrderOfExecution2 {
  
    static 
    {
        System.out.println("static block 1");
    }

    static 
    {
        System.out.println("static block 2");
    }

    {
        System.out.println("non-static block 1");
    }

    {
        System.out.println("non-static block 2");
    }

    public static void main(String[] args) {
        new OrderOfExecution2();
    }

    static 
    {
        System.out.println("static block 3");
    }

    {
        System.out.println("non-static block 3");
    }

    OrderOfExecution2()
    {
        this(22);
        System.out.println("Default constructor"); 
    }

    OrderOfExecution2(int n)
    {
        // this(); // Compilation Error. Reason: It results recursion of constructors.
        System.out.println("Parameterized Constructor");
    }   
}
