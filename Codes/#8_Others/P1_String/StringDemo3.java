
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P1_String;

@SuppressWarnings("all")
public class StringDemo3 {
    public static void main(String[] args) {

        /*
           Note:
           -----
           -> Strings are immuatble i.e. (once created it cannot be modified.)
           
           -> So, all 'String' class methods returning 'String' objects returns 
              new 'String' objects.
           
           -> For more refer to : 
              https://www.javatpoint.com/java-string     
        */
        
        System.out.println("\n\n");

        String str = "          Tony Stark         ";
        String emptyString = "";
        String nullString = null;
        Object result = null;

        System.out.println("str: " + str + "[Length = " + (str.length()) + "]");
        System.out.println("emptyString: " + emptyString + "[Length = " + (emptyString.length()) + "]");

        str = str.trim();
        System.out.println("str: " + str + "[Length = " + (str.length()) + "]");

        result = str.substring(5); // Output: Stark
        System.out.println("\n\"" + result.getClass().getName() + "\" : " + result);

        result = str.substring(5, 10); // Output: Stark
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);

        result = str.intern(); // Output: Tony Stark
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);
        
        result = str.concat(" Ironman"); // Output: Tony Stark Ironman
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);

        result = str.toUpperCase(); // Output: TONY STARK
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);

        result = str.toLowerCase(); // Output: tony stark 
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);

        result = str.replace(' ', '_'); // Output: Tony_Stark
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);

        result = str.replace(" ", "###"); // Output: Tony###Stark
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);

        result = str.toString(); // Output: Tony Stark
        System.out.println("\"" + result.getClass().getName() + "\" : " + result);

        System.out.println("\nstr.isEmpty() : " + str.isEmpty()); // Output: false
        System.out.println("emptyString.isEmpty() : " + emptyString.isEmpty()); // Output: true

        System.out.println("str.indexOf('n'): " + str.indexOf('n')); // Output: 2
        System.out.println("str.indexOf(\"ny\"): " + str.indexOf("ny")); // Output: 2
        
        System.out.println("str.indexOf('n', 1): " + str.indexOf('n', 1)); // Output: 2
        System.out.println("str.indexOf(\"ny\", 2): " + str.indexOf("ny", 2)); // Output: 2
        
        System.out.println("str.indexOf('n', 20): " + str.indexOf('n', 20)); // Output: -1
        System.out.println("str.indexOf(\"ny\", 20): " + str.indexOf("ny", 20)); // Output: -1

        System.out.println("str.contains(\"Sta\"): " + str.contains("Sta")); // Output: true
        System.out.println("str.contains(\"sta\"): " + str.contains("sta")); // Output: false

        System.out.println("str.equals(\"tony stark\"): " + (str.equals("tony stark"))); // Output: false
        
        System.out.println("str.equalsIgnoreCase(\"tony stark\"): " 
        + (str.equalsIgnoreCase("tony stark"))); // Output: true
        
        System.out.println("str.contentEquals(\"Tony Stark\"): " 
        + str.contentEquals("Tony Stark")); // Output: true 

        System.out.println("str.contentEquals(new StringBuilder(\"Tony Stark\")): " 
        + str.contentEquals(new StringBuilder("Tony Stark"))); // Output: true 

        System.out.println("str.charAt(6): " + str.charAt(6)); // Output : t
        
        try{str.substring(5, 20);}catch(Exception e)
        { System.out.println("\n" + e.getClass().getName()); } //Output: java.lang.StringIndexOutOfBoundsException

        try{str.substring(11, 20);}catch(Exception e)
        { System.out.println(e.getClass().getName()); } //Output: java.lang.StringIndexOutOfBoundsException

        try{str.substring(5, 3);}catch(Exception e)
        { System.out.println(e.getClass().getName()); } //Output: java.lang.StringIndexOutOfBoundsException

        try{str.substring(-10, 5);}catch(Exception e)
        { System.out.println(e.getClass().getName()); } //Output: java.lang.StringIndexOutOfBoundsException

        try{str.charAt(20);}catch(Exception e)
        { System.out.println(e.getClass().getName()); } //Output: java.lang.StringIndexOutOfBoundsException
   
        try{str.charAt(-1);}catch(Exception e)
        { System.out.println(e.getClass().getName()); } //Output: java.lang.StringIndexOutOfBoundsException
        
        try{nullString.isEmpty();}catch(Exception e)
        { System.out.println(e.getClass().getName()); } //Output: java.lang.NullPointerException

        System.out.println("\nstr: " + str + "[Length = " + (str.length()) + "]");

        System.out.println("\n\n");
    }
}
