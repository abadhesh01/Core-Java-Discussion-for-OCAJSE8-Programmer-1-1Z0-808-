
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*  
   -> All the exception classes defined by the developer/programmer must 
      extend either 'Throwable' class or it's child classes.
   
   -> 'Exception' is the child class of 'Throwable' class.

   -> 'RuntimeException' is the child class of 'Exception' class.
*/

public class UserDefinedException3 extends RuntimeException {
     
    public UserDefinedException3() 
    {
       super("User Defined Exception: Default Message");
    }

    public UserDefinedException3(String message)
    {
       super("User Defined Exception: " + message);
    }
}
