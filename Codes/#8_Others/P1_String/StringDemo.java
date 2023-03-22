
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P1_String;

public class StringDemo
{
    public static void main(String[] args) {
 
        /*
           String:
           -------
           -> Definition: "A String is a sequence of characters in java."
           
           -> Strings are objects in java.
           
           -> Strings are immuatble i.e. (once created it cannot be modified.)
           
           -> String literals are created in string constant pool.
           
           -> All string literals having same content directly assigned to 'String'
              type variables are same (i.e they share the same content as well as the 
              same address/location in string constant pool).
           
           -> Two or more 'String' constructors having same content assigned to 'String' type
              variables are different (i.e they share the same content but, different 
              addresses/locations in heap).    
           
           -> For more refer to : 
              https://www.javatpoint.com/java-string  
        */
        
        String str = "Sample Text"; // New memory allocated in string constant pool.
        System.out.println("\n\nstr = " + str);
        
        String str2 = new String("Sample Text"); // New memory allocated in heap.
        System.out.println("str2 = " + str2);

        char charArray[] = {'S','a','m','p','l','e',' ','T','e','x','t'}; 
        String str3 = new String(charArray); // New memory allocated in heap.
        System.out.println("str3 = " + str3);

        String str4 = new String(new StringBuilder(str)); // New memory allocated in heap.
        System.out.println("str4 = " + str4);

        String str5 = "Sample Text"; // Holding the string assigned to 'str', returned from string constant pool. 
        System.out.println("str5 = " + str5);
        
        String str6 = str; // Holding the string assigned to 'str'.
        System.out.println("str6 = " + str6);

        String str7 = "sample text"; // New memory allocated in string constant pool.
        System.out.println("str7 = " + str7);

        String str8 = new String();
        System.out.println("str8 = " + str8);

        // Comparing address (using == operator).
        System.out.println("\n[str == str2]: " + (str == str2)); // Output: false
        System.out.println("[str == str3]: " + (str == str3)); // Output: false
        System.out.println("[str == str4]: " + (str == str4)); // Output: false
        System.out.println("[str == str5]: " + (str == str5)); // Output: true
        System.out.println("[str == str6]: " + (str == str6)); // Output: true
        System.out.println("[str == str7]: " + (str == str7)); // Output: false
        System.out.println("[str == str8]: " + (str == str8)); // Output: false

        // Comparing content (using == operator).
        System.out.println("\n[str.equals(str2)]: " + (str.equals(str2))); // Output: true
        System.out.println("[str.equals(str3)]: " + (str.equals(str3))); // Output: true
        System.out.println("[str.equals(str4)]: " + (str.equals(str4))); // Output: true
        System.out.println("[str.equals(str5)]: " + (str.equals(str5))); // Output: true
        System.out.println("[str.equals(str6)]: " + (str.equals(str6))); // Output: true
        System.out.println("[str.equals(str7)]: " + (str.equals(str7))); // Output: false
        System.out.println("[str.equals(str8)]: " + (str.equals(str8))); // Output: false

        System.out.println("\n\n");
    }
}