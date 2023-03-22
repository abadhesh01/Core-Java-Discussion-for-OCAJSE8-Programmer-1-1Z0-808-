
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*  
   -> All the exception classes defined by the developer/programmer must 
      extend either 'Throwable' class or it's child classes.
*/
public class UserDefinedException extends Throwable {
    
    public UserDefinedException() 
    {
       super("User Defined Exception: Default Message");
    }

    public UserDefinedException(String message)
    {
       super("User Defined Exception: " + message);
    }
}
