
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

@SuppressWarnings("all")
public class WrapperClassesObservation2 {
    public static void main(String[] args) {
        System.out.println("\n\n");

        WrapperClassesDemo4.compareObjects((short)-128, (short)-128); // Output: true
        WrapperClassesDemo4.compareObjects((short)127, (short)127); // Output: true
        WrapperClassesDemo4.compareObjects((short)100,(short) 100); // Output: true
        WrapperClassesDemo4.compareObjects((short)100, Short.valueOf((short)100)); // Output: true
        WrapperClassesDemo4.compareObjects((short)100, Short.valueOf("100")); // Output: true
        WrapperClassesDemo4.compareObjects((short)100, Short.parseShort("100")); // Output: true
        WrapperClassesDemo4.compareObjects((short)100, new Short((short)100)); // Output: false
        WrapperClassesDemo4.compareObjects((short)500, (short)500); // Output: false   
     
        System.out.println("\n\n");
    }
}
