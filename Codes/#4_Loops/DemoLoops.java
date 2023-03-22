
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class DemoLoops
{
    public static void main(String[] args) {
     /*
                            -------------
                            Loops in Java
                            -------------

            => Reference: https://www.tutorialspoint.com/java/java_loop_control.htm                  

            => Definition: "Loops are used to execute a statement or a group of statements 
                            multiple times till a condition is 'true'."

            => Following are some loops supported in java:
               (1) while loop
               (2) for loop
               (3) do...while loop              
                            
            [1] while loop:
            ---------------
            ---------------
            -> While loop checks the condition first and then executes the statement or block of statements.
            
            -> Syntax:    while ([boolean_value | boolean_expression])
                          {
                                // Code to be executed if boolean_value or boolean_expression is 'true'.      
                          }

            -> Reference: https://www.tutorialspoint.com/java/java_while_loop.htm

     */     
        
          System.out.println("\n\n[1]");

          int x = 0;

          while (x < 10) 
                System.out.print((x++) + " "); // For single line statement only no curly braces are required.
                System.out.println("\n"); // This line will be executed only once after the loop expires as there are
                                             // no curly braces enlosing the above two statements.

      /*
           [2] for loop:
           -------------
           -------------  

           -> Syntax:  for (variable(s)_initialization; 
                          [boolean_value | boolean_expression]; 
                          increment/decrement_variable(s))
                        {
                            // Code to be executed if boolean_value or boolean_expression is 'true'.
                        }
       
           -> Steps: 1. variable(s)_initialization is executed first and only once. (This is not mandatory.)
                     2. boolean_value or boolean_expression is evaluated and if 'true' the block of code is executed
                        or if 'false' the loop terminates.
                     3. increment/decrement_variable(s) is done. (This is not mandatory.)
                     4. Go to step 2.           
                           
           -> Reference: https://www.tutorialspoint.com/java/java_for_loop.htm          

      */                                       
                     
       System.out.println("\n[2]");
              
       // for loop 1
       for (int count = 1; count < 10; count += 2)
           System.out.print(count + " ");
           System.out.println("\n");
       
       // for loop 2
       int y = 0;  // Initialized variable declared here.
       for (y = 101; y < 110; y += 2)
           System.out.print(y + " ");
           System.out.println("\n");
       
       // for loop 3
       for (/*Not mandatory.*/; y < 120; /*Not mandatory.*/)
       {
            System.out.print(y + " ");
            ++ y;
       }     
            System.out.println("\n");
       
       /* 
            
           [3] do...while loop:
           --------------------
           --------------------
           
           -> Syntax:        do
                             {
                              // Code to be executed.
                             } while ([boolean_value | boolean_expression]) ;

            -> It functions same as while loop.
            -> The only difference between while loop and do...while loop is the code is executed once if the 
               boolean_value or boolean_expression is already 'false'. This is because, in do...while loop the 
               code is executed first at the beginning and then the boolean_value or boolean expression is evaluated
               for next iteration.                  

            -> Reference: https://www.tutorialspoint.com/java/java_do_while_loop.htm

       */     

       System.out.println("\n[3]");

       int z = 1000;

      // do...while loop 1
      do
        System.out.print(z + " "); // Curly braces are not required for single line of code.
      while (++z < 1010);
        
      System.out.println("\n");

      // do...while loop 2
      do {
         System.out.println(++z + "\n\n");  
      } while (false);

    }
}