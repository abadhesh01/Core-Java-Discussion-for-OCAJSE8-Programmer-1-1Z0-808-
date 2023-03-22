
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.util.Arrays;

public class PrintArrayDemo {
    public static void main(String[] args) {
        
          // Creating a 1-D array of size 5 [indices from 0 to 4(size - 1)].
          int intArr[] = new int[5];

          // Creating a 2-D array of 2 rows [row indices are 0 and 1(rows - 1)] and 3 columns 
          // [column indices from 0 to 2(columns - 1)].
          int intArr2D[][] = new int[2][3];

          // Inserting elements into 1-D array.
          intArr[0] = -11;
          intArr[2] = -22;
          intArr[4] = -33;

          // Inserting elements into 2-D array.
          intArr2D[0][0] = 101;
          intArr2D[0][1] = 202;
          intArr2D[0][2] = 303;
          intArr2D[1][0] = 606;
          intArr2D[1][1] = 505;
          intArr2D[1][2] = 404;

          // Printing all the elements of 1-D array.
          System.out.println("\n1-D Array Elements: " + Arrays.toString(intArr));

          // Printing all the elements of 1-D array.
          System.out.println("\n2-D Array Elements:");
          for(int row = 0; row < 2; row ++)
          {
            for(int column = 0; column < 3; column ++)
            {
                System.out.print(intArr2D[row][column] + " \t ");
            }
            System.out.println("\n"); 
          }   
          
    }
}
