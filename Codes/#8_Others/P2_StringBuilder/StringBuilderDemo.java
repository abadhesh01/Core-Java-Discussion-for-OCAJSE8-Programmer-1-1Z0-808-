
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P2_StringBuilder;

@SuppressWarnings("all")
public class StringBuilderDemo {

      /*
         Note:
         ----
         -> 'StringBuilder' is used to create mutable string in java.
         -> For more refer to:
            https://www.javatpoint.com/StringBuilder-class
      */

  public static void showStringBuilders(StringBuilder sb)
  {
      System.out.println("\nsb => \t " + sb + 
      " \t [sb.length() = " + sb.length() 
      + ", sb.capacity() = " + sb.capacity() + "]");
  }  

  public static void main(String[] args) {
    
    System.out.println("\n\n");

    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder(5);
    StringBuilder sb3 = new StringBuilder("Hello");

    showStringBuilders(sb);
    showStringBuilders(sb2);
    showStringBuilders(sb3);

    System.out.println("\n\n");
  }    
}
