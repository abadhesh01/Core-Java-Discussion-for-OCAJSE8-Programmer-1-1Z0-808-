
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

@SuppressWarnings("all")
public class WrapperClassesObservation {
    public static void main(String[] args) {


        System.out.println("\n\n");

        WrapperClassesDemo4.compareObjects((byte)-128, (byte)-128); // Output: true
        WrapperClassesDemo4.compareObjects((byte)127, (byte)127); // Output: true
        WrapperClassesDemo4.compareObjects((byte)100,(byte) 100); // Output: true
        WrapperClassesDemo4.compareObjects((byte)100, Byte.valueOf((byte)100)); // Output: true
        WrapperClassesDemo4.compareObjects((byte)100, Byte.valueOf("100")); // Output: true
        WrapperClassesDemo4.compareObjects((byte)100, Byte.parseByte("100")); // Output: true
        WrapperClassesDemo4.compareObjects((byte)100, new Byte((byte)100)); // Output: false
        WrapperClassesDemo4.compareObjects((byte)500, (byte)500); // Output: true
    
        System.out.println("\n\n");
    }
}
