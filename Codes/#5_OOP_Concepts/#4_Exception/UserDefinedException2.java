
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*  
   -> All the exception classes defined by the developer/programmer must 
      extend either 'Throwable' class or it's child classes.
   
   -> 'Exception' is the child class of 'Throwable' class.
*/

public class UserDefinedException2 extends Exception {
     
    public UserDefinedException2() 
    {
       super("User Defined Exception: Default Message");
    }

    public UserDefinedException2(String message)
    {
       super("User Defined Exception: " + message);
    }
}
