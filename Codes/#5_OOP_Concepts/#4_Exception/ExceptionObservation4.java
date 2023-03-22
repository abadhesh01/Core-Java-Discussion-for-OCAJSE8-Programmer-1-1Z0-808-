
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
    Observation:
    ------------
    In case of method overriding, it's okay not to declare any kind of exceptions in
    child class method no matter whether the parent class method has declared checked and/or
    unchecked exception(s). 
    
    Reference: https://www.geeksforgeeks.org/exception-handling-with-method-overriding-in-java/
*/

class Delta
{
   public void deltaFunction() throws  
   java.io.IOException // Checked Exception
   ,RuntimeException // Unchecked Exception
   {
      System.out.println("deltaFunction(): Delta");
   }
}

public class ExceptionObservation4 extends Delta
{

   @Override 
   public void deltaFunction()
   {
      System.out.println("deltaFunction(): ExceptionObservation4");
   }

   public static void main(String[] args) throws Throwable {
        new Delta().deltaFunction();   
        new ExceptionObservation4().deltaFunction();
   }
}