
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class RuntimeExceptionDemo3 {
    public static void main(String[] args) //throws java.lang.NumberFormatException
    {

        /* Function: "Integer.parseInt()"
           ------------------------------
           -> Input: A valid string containing integer digits only.
           -> Output/Return Value: Integer Number.
         */

        System.out.println(Integer.parseInt("108"));
        System.out.println(Integer.parseInt("0878"));
        /*
         The below statement will cause an  "Runtime Exception/Unchecked Exception".
         Exception Name: "java.lang.NumberFormatException" 
         Cause: "For input string: "Not a valid number string"".
         -> "The compiler does not forces to handle the runtime exception / unchecked exception."
        */
        System.out.println(Integer.parseInt("Not a valid number string"));
    }
}
