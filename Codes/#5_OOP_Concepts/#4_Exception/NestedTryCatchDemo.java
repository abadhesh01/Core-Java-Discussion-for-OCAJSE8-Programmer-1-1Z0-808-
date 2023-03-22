
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class NestedTryCatchDemo
{
  public static void main(String[] args)  {
    
    System.out.println("\n\n");

    // Nested try-catch block.
    try
    {
         try{
            throw new IndexOutOfBoundsException("My Throw.");
         } catch (Exception e) {
            System.out.println(e.getMessage()); 
         } finally {
            // This block is not mandatory.
            System.out.println("Nothing to execute.");  
         }
    } catch (Throwable t)
    {
       System.out.println(t.getMessage());
    }

    System.out.println("\n\n");
  }   
}