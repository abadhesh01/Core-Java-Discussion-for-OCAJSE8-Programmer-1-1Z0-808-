
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatchBlockDemo {

    public static void userCodeMessage(int userCode) 
    throws UserDefinedException, UserDefinedException2,
           FileNotFoundException, Exception
    {
       /* 
           Note:
           -----
           -> 'Error' and it's child classes and 'RuntimeException' and it's child classes
               are considered as unchecked exceptions. Rest of the exceptions belonging to 
               'Exception' or 'Throwable' are considered as checked exceptions. 

           -> In multi-catch block, the catch block that catches the exception class of
              higher-level is at the last in the order of catch block. (If not, it results in
              an compile-time error.) 

          "throws" keyword:
           -----------------
           -> The 'throws' clause is used to throw an exception from the method
              to the caller of the method rather than handling it within the method.

           -> It can throw multiple exceptions.   

           -> Here main() method is the caller of userCodeMessage() method.
       
           "throw" keyword:
           ----------------
           -> The 'throw' keyword is used to manually throw any user-defined 
              or pre-defined exception.  

           -> It can throw only the instance of 'Execption' or it's child classes.
        */ 

        if(userCode == 0)
           throw new Error("Custom Error");

        if(userCode == 1)
           throw new UserDefinedException();

        if(userCode == 2)
           throw new UserDefinedException2("Lorem");
           
        if(userCode == 3)
           throw new UserDefinedException3("Ipsium");
           
        if(userCode == 4)   
           throw new ArithmeticException("Custom ArithmeticException");

        if(userCode == 5)   
           throw new ArrayIndexOutOfBoundsException("Custom ArrayIndexOutOfBoundsException");   

        if(userCode == 6)   
           throw new NumberFormatException("Custom NumberFormatException");

        if(userCode == 7)   
           throw new StringIndexOutOfBoundsException("Custom StringIndexOutOfBoundsException");   
    
        if(userCode == 8)
           throw new FileNotFoundException("Custom FileNotFoundException");

        if(userCode == 9)
            throw new SQLException("Custom SQLException");
            
        System.out.println("\nAll criterias passed successfully! :)\n");    
    } 

    public static void main(String[] args) {
     
        System.out.println("\n\n");

        // Multiple Catch Blocks
        int code = 0;
        while(code < 11)
        {
            try {
                System.out.print(code + " : ");
                userCodeMessage(code ++);
            } catch (UserDefinedException e) {
                // Handling checked exception.
                System.out.println(e.getMessage());
            } catch (UserDefinedException2 e) {
                // Handling checked exception.
                System.out.println(e.getMessage());
            }  catch (UserDefinedException3 e) {
                // Handling unchecked exception because, 
                // 'UserDefinedException3'  extends 'RuntimeException'.
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                // Handling unchecked exception.
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handling unchecked exception.
                System.out.println(e.getMessage());
            } catch (Error e) {
                // Handling unchecked exception.
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                // Handling unchecked exception.
                System.out.println(e.getMessage());
            } catch (StringIndexOutOfBoundsException e) {
                // Handling unchecked exception.
                System.out.println(e.getMessage());
            } catch (FileNotFoundException e) {
                // Handling checked exception.
                System.out.println(e.getMessage());
            } catch (SQLException e) {
                // Handling checked exception.
                System.out.println(e.getMessage());    
            } catch (Exception e) {
                // Handling exception (Either checked or unchecked exception).
                System.out.println(e.getMessage());
            }

             System.out.println("\n\n");
        }
    }
}
