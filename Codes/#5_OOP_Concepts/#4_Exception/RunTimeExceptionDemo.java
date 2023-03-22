
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class RunTimeExceptionDemo {
   public static void main(String[] args) //throws ArithmeticException
   {
      int x = 108;
      int y = 0;
      /*
         The below statement will cause an  "Runtime Exception/Unchecked Exception".
         Exception Name: "java.lang.ArithmeticException" 
         Cause: " / by zero"
         -> "The compiler does not forces to handle the runtime exception / unchecked exception."
      */
      int result = (x / y); 
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      System.out.println("(x / y) = " + result);
   }   
}
