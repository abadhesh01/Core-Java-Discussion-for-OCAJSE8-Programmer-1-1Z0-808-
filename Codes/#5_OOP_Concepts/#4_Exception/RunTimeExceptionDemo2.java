
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.util.concurrent.ThreadLocalRandom;

public class RunTimeExceptionDemo2 {
    public static void main(String[] args) //throws ArrayIndexOutOfBoundsException 
    {
        
        // Creating an array of type 'int' and size of 7 indices.
        int arr[] = new int[7];

        // Inserting 7 random elements ranging from 0 to 100 in the array.
        for (int index = 0; index < arr.length; index ++)
            arr[index] = ThreadLocalRandom.current().nextInt(0, 100);

        /*
         The below statement will cause an  "Runtime Exception/Unchecked Exception".
         Exception Name: "java.lang.ArrayIndexOutOfBoundsException" 
         Cause: "Index 7 out of bounds for length 7"
         -> "The compiler does not forces to handle the runtime exception / unchecked exception."
        */
        // Accessing all the indices of the array.
        int index = 0;
        while(true)
              System.out.print(arr[index ++] + " ");
                      
    }
}