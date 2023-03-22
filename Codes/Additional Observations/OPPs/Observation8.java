
// Author: Abadhesh Mishra [Employee Id: 8117322]

/* 
   Note:
   ----- 
   Checked exceptions cannot be caught if there is no chance 
   that the code is generating it but, it can be thrown anyway.
*/

public class Observation8 {    

  public static void main(String[] args) throws
  java.io.IOException, // Checked Exception   
  java.sql.SQLException, // Checked Exception
  ArithmeticException,
  NumberFormatException,
  RuntimeException,
  Exception,
  Error,
  Throwable 
  {

    // Compilation Error: Checked Exception cannot be caught if there is no chance 
    // that the code is generating it but, it can be thrown anyway.

    //try {} catch (java.sql.SQLException e) {} // Compilation Error 
    //try {} catch (java.io.IOException e) {} // Compilation Error

    try {} catch (ArithmeticException e) {} // Child class of 'RuntimeException'.
    try {} catch (NumberFormatException e) {} // Child class of 'RuntimeException'.
    try {} catch (RuntimeException e) {}
    try {} catch (Exception e) {}
    try {} catch (Error e) {}
    try {} catch (Throwable t) {}

    System.out.println();

    try
     {
        throw new ArithmeticException("My ArithmeticException");
     } catch (ArithmeticException exception)
     {
        System.out.println(exception);
     }

     System.out.println();

     // Program will terminate abruptly because, 'ArithmeticException' is 
     // being thrown and no catch block is there compatible with 'ArithmeticException'.
     try
     {
        throw new ArithmeticException("My ArithmeticException");
     } catch (ArrayIndexOutOfBoundsException exception)
     {
        System.out.println(exception);
     }

     System.out.println();

  }    
}
