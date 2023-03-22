
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

@SuppressWarnings("all")
public class WrapperClassesDemo2 {
   public static void main(String[] args) {

       // Exceptions while parsing numbers into objects.
       // Note: 'byte' ranges from -128 to 127.

       System.out.println();
    
       try {new Byte(null); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {new Byte("Sample Text"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {new Byte("12_7"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {new Byte("12.5"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {new Byte("128"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {Byte.valueOf("130"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {Byte.valueOf("1_0"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {Byte.valueOf("13.0"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {Byte.parseByte("10.77"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {Byte.parseByte("10_7"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       try {Byte.parseByte("145"); // Output: java.lang.NumberFormatException
       } catch (Exception e) {System.out.println(e.getClass().getName());}

       System.out.println();
   }       
}
