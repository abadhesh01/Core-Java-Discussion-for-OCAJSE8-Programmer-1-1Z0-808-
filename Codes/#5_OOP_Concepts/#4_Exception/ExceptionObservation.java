
// Author: Abadhesh Mishra [Employee Id: 8117322]

/* 
    Observation: 
    ------------
    In case of method overriding, if the parent class method has declared no exception,
    the child class method can declare unchecked exception(s) only.

    Reference: https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/
*/

class Alpha
{
    public void alphaFunction() 
    {
         System.out.println("alphaFunction() : Alpha");
    }
}

public class ExceptionObservation extends Alpha {

    @Override
    public void alphaFunction() throws 

    /*Unchecked Exceptions*/
    
      ArithmeticException // Unchecked Exception                 
    , IndexOutOfBoundsException // Unchecked Exception 
    , ArrayIndexOutOfBoundsException // Unchecked Exception
    , StringIndexOutOfBoundsException // Unchecked Exception
   
    , NumberFormatException // Unchecked Exception
    , NullPointerException // Unchecked Exception
    , RuntimeException // Unchecked Exception
    , UserDefinedException3 // Unchecked Exception as it extends 'RuntimeException'

    
    /*Checked Exceptions*/

    //, java.io.IOException // Checked Exception
    //, java.io.FileNotFoundException // Checked Exception
    //, java.sql.SQLException // Checked Exception
    //, UserDefinedException // Checked Exception
    //, UserDefinedException2 // Checked Exception

    /*Exception Not Specified*/

    //, Throwable // Not Specified
    //, Exception // Not Specified
      
    {
         System.out.println("alphaFunction() : ExceptionObservation");
    }

    public static void main(String[] args) {
        new Alpha().alphaFunction();   
        new ExceptionObservation().alphaFunction();
    }
}
