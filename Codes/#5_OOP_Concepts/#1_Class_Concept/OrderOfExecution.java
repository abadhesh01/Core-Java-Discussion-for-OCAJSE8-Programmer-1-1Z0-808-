
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class OrderOfExecution {

    static 
    {
        System.out.println("static block 1");
    }

    static 
    {
        System.out.println("static block 2");
    }

    {
        display("Hi! :)");
        this.display("Show Me :)"); // 'this' keyword can be used inside non-static block also.
        System.out.println("non-static block 1");
    }

    {
        System.out.println("non-static block 2");
    }

    public static void main(String[] args) {
        new OrderOfExecution(1);
    }

    static 
    {
        System.out.println("static block 3");
    }

    {
        System.out.println("non-static block 3");
    }

    OrderOfExecution()
    {
        System.out.println("Default constructor"); 
    }

    OrderOfExecution(int n)
    {
        this();
        System.out.println("Parameterized Constructor");
    }

    void display(String text)
    {
        System.out.println(text);
    }
}
