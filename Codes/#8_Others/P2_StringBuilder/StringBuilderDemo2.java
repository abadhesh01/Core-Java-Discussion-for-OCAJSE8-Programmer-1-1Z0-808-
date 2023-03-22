
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P2_StringBuilder;

public class StringBuilderDemo2 {
   public static void main(String[] args) {

      /*
         Note:
         ----
         -> 'StringBuilder' is used to create mutable string in java.
         -> For more refer to:
            https://www.javatpoint.com/StringBuilder-class
      */

      StringBuilder sb = new StringBuilder("Tony");
      System.out.println("\n\nsb = " + sb + " [size = " + sb.length() + "]");

      sb.append(' ').append('S')
      .append('t').append('a').append('r')
      .append('k').append(" Ironman").getClass().getName();
      System.out.println("sb = " + sb + " [size = " + sb.length() + "]"); 

      sb.delete(4, 10);
      System.out.println("sb = " + sb + " [size = " + sb.length() + "]");

      sb.insert(5, "Afghanistan ");
      System.out.println("sb = " + sb + " [size = " + sb.length() + "]");

      sb.reverse();
      System.out.println("sb = " + sb + " [size = " + sb.length() + "]\n\n");

   }    
}
