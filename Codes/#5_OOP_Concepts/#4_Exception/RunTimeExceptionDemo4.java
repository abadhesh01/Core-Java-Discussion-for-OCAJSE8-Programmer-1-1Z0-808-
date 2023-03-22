
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class RunTimeExceptionDemo4 {
    public static void main(String[] args) //throws StringIndexOutOfBoundsException 
    {
        
        // Creating a random "String".
        String anyName = "Mr. Bean";
        int index = 0;
         
        /*
         The below statement will cause an  "Runtime Exception/Unchecked Exception".
         Exception Name: "java.lang.StringIndexOutOfBoundsException" 
         Cause: "Index 8 out of bounds for length 8"
         -> "The compiler does not forces to handle the runtime exception / unchecked exception."
        */
        // Accessing all the elements of the random string.
        while(true)
            System.out.println("Index: " + index + " \t|\t Character: " + anyName.charAt(index ++)); 
    }
}
