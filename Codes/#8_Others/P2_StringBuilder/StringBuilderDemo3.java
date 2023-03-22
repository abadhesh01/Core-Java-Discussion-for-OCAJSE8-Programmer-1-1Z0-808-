
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P2_StringBuilder;

public class StringBuilderDemo3 {

    /*
       Note: 'StringBuilder' does not override 'equals()' method from 'Object' class.
              So 'equals' method in 'StringBuilder' class does the same job as of
              '==' operator.  
    */ 
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Kamaz");
        StringBuilder sb2 = sb;
        StringBuilder sb3 = new StringBuilder("Kamaz");

        System.out.println("\n\n[sb == sb2]: " + (sb == sb2)); // Output: true
        System.out.println("[sb == sb3]: " + (sb == sb3)); // Output: false
        System.out.println("[sb.equals(sb2)]: " + sb.equals(sb2)); // Output: true
        System.out.println("[sb.equals(sb3)]: " + sb.equals(sb3) + "\n\n"); // Output: false
    }
}
