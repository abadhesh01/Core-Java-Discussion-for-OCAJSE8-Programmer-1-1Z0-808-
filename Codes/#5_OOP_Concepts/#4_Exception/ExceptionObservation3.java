
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
    Observation:
    ------------
    In case of method overriding, if the parent class method has declared checked exception(s),
    the child class method can declare checked exception(s) of same type as of parent class method 
    and/or child class(es) of checked exception(s) declared in parent class method and/or any
    unchecked exception(s).
    
    Reference: https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/
*/

class Charle
{
     public void charleFunction() throws
     java.io.FileNotFoundException, // Child class of 'java.io.IOException'.
     java.io.EOFException, // Child class of 'java.io.IOException'.
     java.sql.SQLException // Parent class of 'java.sql.SQLDataException' and 'java.sql.SQLTimeoutException'.
     {
        System.out.println("charleFunction(): Charle");
     }
}

public class ExceptionObservation3 extends Charle {

    @Override
    public void charleFunction() throws
    java.io.FileNotFoundException
    ,java.io.EOFException
    //,java.io.IOException // Compilation Error: "Parent exception(s) cannot be thrown."
    ,java.sql.SQLDataException
    ,java.sql.SQLTimeoutException
    //,ParseException  // Compilation Error: "Not declared in parent class method."
    ,RuntimeException
    ,IndexOutOfBoundsException
    {
        System.out.println("charleFunction(): ExceptionObservation3");
    }    
    public static void main(String[] args) throws Exception {
        new Charle().charleFunction();
        new ExceptionObservation3().charleFunction();
    }
}
