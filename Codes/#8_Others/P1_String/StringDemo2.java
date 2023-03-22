
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P1_String;

public class StringDemo2 {
  public static void main(String[] args) {
    
    System.out.println("\n\n");

    String name = "Tony Stark";
    System.out.println("name = " + name);

    final String tony = "Tony";
    System.out.println("tony = " + tony);

    String stark = "Stark";
    System.out.println("stark = " + stark);

    String tonyPlusStark = "Tony" + " " +"Stark"; // Assigns the same 'String' from string constant pool.
    System.out.println("tonyPlusStark = " + tonyPlusStark);
    
    String fullName = "Tony" + " " + stark; // Creates a new string as the variable 'stark' is non-'final'.
    System.out.println("fullName = " + fullName);

    String fullName2 = tony + " " + "Stark"; // Assigns the same 'String' from string constant pool
                                             // as the variable 'tony' is 'final'.
    System.out.println("fullName2 = " + fullName2);

    final String blankSpace; blankSpace = " ";
    String fullName3 = "Tony" + blankSpace + "Stark";
    
    System.out.println("\n[name == tonyPlusStark]: " + (name == tonyPlusStark)); // Output: true
    System.out.println("[name == fullName]: " + (name == fullName)); // Output: false
    System.out.println("[name == fullName2]: " + (name == fullName2)); // Output: true
    System.out.println("[name == fullName3]: " + (name == fullName3)); // Output: false

    System.out.println("\n\n");
  }    
}
