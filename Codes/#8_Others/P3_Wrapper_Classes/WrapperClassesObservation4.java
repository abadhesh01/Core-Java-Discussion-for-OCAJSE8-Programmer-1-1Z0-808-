
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

@SuppressWarnings("all")
public class WrapperClassesObservation4 {
  public static void main(String[] args) {

    System.out.println("\n\n");

    WrapperClassesDemo4.compareObjects(-128L, -128L); // Output: true
    WrapperClassesDemo4.compareObjects(127L, 127L); // Output: true
    WrapperClassesDemo4.compareObjects(100L, 100L); // Output: true
    WrapperClassesDemo4.compareObjects(100L, Long.valueOf(100)); // Output: true
    WrapperClassesDemo4.compareObjects(100L, Long.valueOf("100")); // Output: true
    WrapperClassesDemo4.compareObjects(100L, Long.parseLong("100")); // Output: true
    WrapperClassesDemo4.compareObjects(100L, new Long(100)); // Output: false
    WrapperClassesDemo4.compareObjects(500L, 500L); // Output: false

    System.out.println("\n\n");
  }
}       
