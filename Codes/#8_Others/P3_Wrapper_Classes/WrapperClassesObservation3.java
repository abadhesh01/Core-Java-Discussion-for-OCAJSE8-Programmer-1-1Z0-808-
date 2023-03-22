
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

@SuppressWarnings("all")
public class WrapperClassesObservation3 {
    public static void main(String[] args) {
        System.out.println("\n\n");

       WrapperClassesDemo4.compareObjects(-128, -128); // Output: true
       WrapperClassesDemo4.compareObjects(127, 127); // Output: true
       WrapperClassesDemo4.compareObjects(100, 100); // Output: true
       WrapperClassesDemo4.compareObjects(100, Integer.valueOf(100)); // Output: true
       WrapperClassesDemo4.compareObjects(100, Integer.valueOf("100")); // Output: true
       WrapperClassesDemo4.compareObjects(100, Integer.parseInt("100")); // Output: true
       WrapperClassesDemo4.compareObjects(100, new Integer(100)); // Output: false
       WrapperClassesDemo4.compareObjects(500, 500); // Output: false
    
       System.out.println("\n\n");
    }
}
