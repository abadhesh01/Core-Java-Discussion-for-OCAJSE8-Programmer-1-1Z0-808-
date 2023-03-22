
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.util.Arrays;

@SuppressWarnings("all")
public class MultiDimensionalArrayDemo {
   public static void main(String[] args) {
    
       /*
          1-D Array variables: 'e', 'f';

          2-D Array variables: 'intArr', 'intArr2', 'intArr3', 'g', 'h';

          3-D Array variables: 'sampleInt3DArray' , 'sampleInt3DArray2';

          Variables: 'c', 'd';
       */

       int intArr[][], c, d;
       int[] intArr2[], e, f;
       int[][] intArr3, g, h = {{11, 22}, {33, 44}, {55, 66}};

       intArr = new int[3][2];
       c = 11;
       d = 12;
       intArr2 = new int [][] {{111, 222}, {333}, {444, 555},};
       e = new int [] {0, 1, 2};
       f = new int [] {};
       intArr3 = intArr;
       g = new int [3][]; // At least 1st dimension should be initialized. 


       System.out.println("\nintArr2" + intArr2);
       for(int row = 0; row < intArr2.length; row ++)
       {
          int tempIntArr[] = intArr2[row]; 
          System.out.println(tempIntArr + " : " + Arrays.toString(tempIntArr));

          for(int column = 0; column < tempIntArr.length; column ++)
          {
            System.out.print(intArr2[row][column] + " ");
          }
          System.out.println();
       }

       System.out.println();


       int sampleInt3DArray [][][] = {
                                     {{11, 22}, {33, 44}, {55, 66}},
                                     {{111, 222}, {333}, {444, 555},}
                                     };

       int sampleInt3DArray2 [][][] = {intArr, intArr2, intArr3}; 
       
       System.out.println("sampleInt3DArray: " + sampleInt3DArray);
       System.out.println("sampleInt3DArray2: " + sampleInt3DArray2 + "\n");

       // Iterating through 2-D array using for-each loop.
       System.out.println(intArr2);
       for(int[] is : intArr2)
          System.out.println("|____>" + is);  

        System.out.println();  

        // Iterating through 3-D array using for-each loop.
       System.out.println(sampleInt3DArray2);
       for(int[][] is : sampleInt3DArray2)
          System.out.println("|____>" + is);    
           

        System.out.println();  
   } 
}
