
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
    Observation:
    ------------
    In case of method overriding, if the parent class method has declared unchecked exception(s),
    the child class method can declare any unchecked exception(s) only.
    
    Reference: https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/
*/

class Bravo
{
    public void betaFunction() throws 
    ArrayIndexOutOfBoundsException, 
    StringIndexOutOfBoundsException,
    UserDefinedException3
    {
       System.out.println("betaFunction(): Bravo");
    }
}

public class ExceptionObservation2 extends Bravo {

    @Override
    public void betaFunction() throws 
    RuntimeException,
    IndexOutOfBoundsException,
    ArrayIndexOutOfBoundsException,
    StringIndexOutOfBoundsException,
    NullPointerException,
    ArithmeticException,
    NumberFormatException
    //,java.io.IOException // Compilation Error
    {
       System.out.println("betaFunction(): ExceptionObservation2");
    }

    public static void main(String[] args) throws Exception {
        new Bravo().betaFunction();
        new ExceptionObservation2().betaFunction();
    }
}
