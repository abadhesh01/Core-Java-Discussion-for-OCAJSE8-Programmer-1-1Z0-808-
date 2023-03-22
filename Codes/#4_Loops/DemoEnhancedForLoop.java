
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class DemoEnhancedForLoop
{
    public static void main(String[] args) {
        /*
              Enhanced for loop:
              ------------------
              -> This is used to traverse through an arry of elements or a collection of elements.
              
              -> Syntax:  for (variable : expression)
                          {
                              // Statement(s).
                          }
              
              -> The expression is a reference to an array/collection or a method returning an array/collection.
              
              -> The variable is type compatible with expression and only available to the foreach loop block.
                 It's value is same as current array element as it traverse through the expression.
              
        */

        System.out.println();

        int charArray [] = {65, 66, 67, 68, 69, 70, 71};
        
        for (int element : charArray) {
            System.out.print((char) element + " ");
        }
    
        System.out.println("\n\n");
    }
}