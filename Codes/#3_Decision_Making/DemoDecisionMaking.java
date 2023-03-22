
// Author: Abadhesh Mishra [Employee Id: 8117322]

@SuppressWarnings("all")
public class DemoDecisionMaking
{
  public static void main(String[] args) {
    /*
               -----------------------                 
               Decision Making in JAVA
               ------------------------

               Following are some dicision making structures:
               
               (1) if statement
               (2) if...else statement
               (3) if...else...if statement
               (4) nested if statement
               (5) switch statement        
               
               Reference: https://www.tutorialspoint.com/java/java_decision_making.htm     


         [1] if statement:
         -----------------
         -----------------
         
         Syntax:    if([boolean_value | boolean_expression])
                    {
                        // Block of code to be executed if boolean_value or boolean_expression is 'true'. 
                    }

         Reference: https://www.tutorialspoint.com/java/if_statement_in_java.htm           
     
    */

        System.out.println("\n\n[1]");
        int a = 100;
        int b = 200;

        System.out.println("a = " + a + ", b = " + b);

        // if statement 1
        if (a == b)
        {
            System.out.println("a == b");
        }

        // if statement 2
        if (a != b)
           System.out.println("a != b"); // For single line statement only no curly braces are required.


        // if statement 3 
        if (a < b && a != b)
        {
           System.out.print("a < b && ");
           System.out.println("a != b");
        }  
           

     /*
        [2] if...else statement:
        ------------------------
        ------------------------
         
         Syntax:    if ([boolean_value | boolean_expression])
                    {
                        // Block of code to be executed if boolean_value or boolean_expression is 'true'. 
                    }
                    else
                    {
                        // Block of code to be executed if boolean_value or boolean_expression is 'false'.
                        // This block is not mandatory.
                    }

          Reference: https://www.tutorialspoint.com/java/if_else_statement_in_java.htm 

     */

        System.out.println("\n\n[2]");
        System.out.println("a = " + a + ", b = " + b);

        // if...else statement 1
        if(a != b)
           System.out.println("a != b");
        else
           System.out.println("a == b");   

        // if...else statement 2
        if(!(a != b))
           System.out.println("!(a != b)");
        else
           System.out.println("!(a == b)");     

     /*
        [3] if...else...if statement:
        -----------------------------
        -----------------------------
         
         Syntax:    if ([boolean_value_1 | boolean_expression_1])
                    {
                        // Block of code to be executed if boolean_value_1 or boolean_expression_1 is 'true'. 
                    }
                    else if ([boolean_value_2 | boolean_expression_2])
                    {
                        // Block of code to be executed if boolean_value_2 or boolean_expression_2 is 'true'.
                    }
                    else if ([boolean_value_3 | boolean_expression_3])
                    {
                        // Block of code to be executed if boolean_value_3 or boolean_expression_3 is 'true'.
                    }
                    ......................................
                    else if ([boolean_value_N | boolean_expression_N])
                    {
                        // Block of code to be executed if boolean_value_N or boolean_expression_N is 'true'.
                    }
                    else
                    {
                        // Block of code to be executed if none of the above conditions were satisfied.
                        // This block is not mandatory.
                    }

               Note: If a if...else...if structure contains multiple 'true' expressions/values as arguements in any block 
                     parameters, the block whose 'true' expression/value comes first will be executed only.     
                           
     */
    
                    System.out.println("\n\n[3]");

                    if (false)
                       System.out.println("Block 1");
                    else if (false)   
                       System.out.println("Block 2");
                    else if (false)   
                       System.out.println("Block 3");   
                    else if (true)   
                       System.out.println("Block 4");
                    else if (true)   
                       System.out.println("Block 5");
                    else if (false)   
                       System.out.println("Block 6");
                    else if (true)   
                       System.out.println("Block 7");
                    else // 'else' block is not mandatory here.
                       System.out.println("Default Block!");            

     /*
        [4] Nested if statement:
        ------------------------
        ------------------------
                        
         Syntax: if([boolean_value_1 | boolean_expression_1])
                 {
                    // Block of code to be executed if boolean_value_1 or boolean_expression_1 is 'true'.

                    if([boolean_value_2 | boolean_expression_2])
                    {
                        // Block of code to be executed if boolean_value_2 or boolean_expression_2 is 'true'.
                    }
                 }
               
          Reference: https://www.tutorialspoint.com/java/nested_if_statements_in_java.htm 

     */

     System.out.println("\n\n[4]");
     System.out.println("a = " + a + ", b = " + b);

     // Nested if demo 1
     if (a > 0 && b > 0)
     {
        System.out.println("Outer Block: [a > 0 && b > 0]");
        if (a < b)
        {
            System.out.println("|_____>Inner Block: [a < b]");
        }
     }

     // Nested if demo 2
     if (true)
     {
       System.out.println("\n[Boolean Outer Block]"); 
       if (true)
          System.out.println("|_____>[Boolean Inner Block]");
     }   

     /* 
         [5] switch statement:
         ---------------------
         ---------------------

         syntax :  switch([value | expression])
                   {
                       case value_1: //statements
                                     break; // optional
                       
                       case value_2: //statements
                                     break; // optional 
                        
                       case value_3: //statements
                                     break; // optional
                                     
                       ................................
                       
                       case value_N: //statements
                                     break; // optional
                        
                       default: //statements
                                //optional              
                   }

          -> Variables used in switch statement can only be of type 'int' or convertable integers('byte', 'char', 'short'),
             strings and enums.
          -> The 'case' value must be of same data type as of 'switch' value or expression.   
          -> 'default' case is optional. It is executed if no other cases were satisfied. 
          -> 'break' is optional.   
          -> If 'break' not applied at any 'case' then the flow will move to next 'case' and will continue utill
             either a 'break' is found in any case or upto 'default' statements are executed or at the end of the 
             'switch' block is reached.    
 
           Reference: https://www.tutorialspoint.com/java/switch_statement_in_java.htm

     */

     System.out.println("\n\n[5] switch statement:");
     System.out.println("----------------------");

     String number = "Five";
     long value = 'F';

     // switch statement 1

     switch (number)
     {
         case "One": System.out.println("One");

         case "Two": System.out.println("Two");

         case "Three": System.out.println("Three");

         case "Four": System.out.println("Four");

         case "Five": System.out.println("Five");

         case "Six": System.out.println("Six");

         case "Seven": System.out.println("Seven");

         case "Eight": System.out.println("Eight");

         case "Nine": System.out.println("Nine");

         default: System.out.println("Zero"); // This is optional.
     }

     System.out.println();

     // switch statement 2

     switch ((int)(value))
     {
        case 'A': System.out.println('A');
        case 'B': System.out.println('B');
                  break; // This is optional.
        case 'C': System.out.println('C');
        case 'D': System.out.println('D');
                  break; // This is optional.
        case 69 : System.out.println((char) 69);
        case 70 : System.out.println((char) 70);
        case 71 : System.out.println((char) 71);
        case 72 : System.out.println((char) 72);
        case 73 : System.out.println((char) 73);
                  break; // This is optional.
        case 74 : System.out.println((char) 74);
        case 75 : System.out.println((char) 75);
        case 'L': System.out.println('L');
        case 'M': System.out.println('M');
        case 'M' + 1: System.out.println((char) ('M' + 1)); 
     }

     System.out.println("\n");
  }
}