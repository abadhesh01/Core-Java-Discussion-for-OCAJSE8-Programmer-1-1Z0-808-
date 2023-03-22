import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Author: Abadhesh Mishra[Employee Id: 8117322]

// Reference: https://www.geeksforgeeks.org/try-with-resources-feature-in-java/

public class TryWithResourcesDemo {

    private static int count;

    static
    {
         InputStreamReader ipsr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(ipsr);
         
         // Closing resources using try-catch-finally statement.
         try {
            System.out.println("Obj-" + (++count) + ":   " + ipsr);
            System.out.println("Obj-" + (++count) + ":   " + br);
         } catch (Exception e) {
            System.out.println(e.getMessage());
         } finally {
            // This block is not mandatory.
            try {
                // Closing Resources
                ipsr.close();
                br.close(); 
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
         }            
    }
    public static void main(String[] args) {
        
        // Closing resources using try-with-resources statement.
        try (InputStreamReader ipsr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(ipsr)) {
            
                System.out.println("Obj-" + (++count) + ":   " + ipsr);
                System.out.println("Obj-" + (++count) + ":   " + br);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // This block is not mandatory.
            System.out.println("Execution successful. :)");
        }

    }
}
