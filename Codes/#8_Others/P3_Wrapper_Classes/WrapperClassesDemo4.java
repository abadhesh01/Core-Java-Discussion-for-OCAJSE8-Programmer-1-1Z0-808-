
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

@SuppressWarnings("all")
public class WrapperClassesDemo4 {

    /*
       Note:
       -----
       -> Two or more 'Byte', 'Short', 'Integer' or 'Long' objects share same address
          only if their range falls between -128 to 127 (except 'Byte' because, it ranges 
          from -128 to 127) and if they are not created through constructors.
    */ 

    public static void compareObjects(Long objA, Long objB)
    {
         System.out.println("\nComparing Two \"Long\" objects:");
         System.out.println("objA = " + objA);    
         System.out.println("objB = " + objB);
         System.out.println("[objA == objB]: " + (objA == objB)); 
    }  

  public static void compareObjects(Integer objA, Integer objB)
  {
       System.out.println("\nComparing Two \"Integer\" objects:");
       System.out.println("objA = " + objA);    
       System.out.println("objB = " + objB);
       System.out.println("[objA == objB]: " + (objA == objB)); 
  }


  public static void compareObjects(Short objA, Short objB)
  {
       System.out.println("\nComparing Two \"Short\" objects:");
       System.out.println("objA = " + objA);    
       System.out.println("objB = " + objB);
       System.out.println("[objA == objB]: " + (objA == objB)); 
  }

  public static void compareObjects(Byte objA, Byte objB)
  {
       System.out.println("\nComparing Two \"Byte\" objects:");
       System.out.println("objA = " + objA);    
       System.out.println("objB = " + objB);
       System.out.println("[objA == objB]: " + (objA == objB)); 
  }

}    


