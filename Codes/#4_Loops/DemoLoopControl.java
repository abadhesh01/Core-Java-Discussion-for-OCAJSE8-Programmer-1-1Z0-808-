
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class DemoLoopControl {
    public static void main(String[] args) {
        /*
                  -----------------------    
                  Loop Control Statements
                  -----------------------

            => Reference: First go and read "DemoLoops.java" source code file before reading this source code file.      

            => Definition: "Loop Control Statements change execution of loops from its' normal sequence."

            => Loop Control Statements are used inside loops.
            
            => Following are some loop control statements supported in java:
               (1) break
               (2) continue

             [1] "break" statement:
             ----------------------
             ----------------------
             -> It has the following 2 usages:
                1. Terminates any loop compleately if encountered during execution of statements inside it.
                2. Terminates a 'case' in 'switch' statement. 

             -> Reference: https://www.tutorialspoint.com/java/java_break_statement.htm

        */

        System.out.println("\n\n[1]");
        int n = 0;
        while (true) {
            if(n++ < 10)
            {
               System.out.print(n + " ");
            }
            else
            {
                System.out.println("\n\n");
                break;
            }
        }

        /*
            [2] "continue" statement:
            -------------------------
            -------------------------
            -> Skips the current iteration and moves for next execution if encontered during execution of
               statements inside any loop.
            -> In case of for loop the control jumps to update statement.
            -> In case of while and do...while loop the control jumps to boolean_value or boolean_expression.
            
            -> Reference: https://www.tutorialspoint.com/java/java_continue_statement.htm 

        */

        System.out.println("\n\n[2]");
        
        // "continue" statement example 1
        for (int count = 1; count <= 30; ++ count)
        {
            if (count % 3 == 0)
            {
               System.out.println(); 
               continue;
            }   
            else
               System.out.print(count + " ");
        }

        System.out.println("---------------------------------");

        // "continue" statement example 2
        int number = 1;
        while(number < 50)
        {
            int temp = number;
            if (number ++ % 4 == 0)
            {
               System.out.println(); 
               //number ++;
               continue;
            }   
            else
            {
                System.out.print(temp + " ");
                //number ++;
            }
        }
    }
}
