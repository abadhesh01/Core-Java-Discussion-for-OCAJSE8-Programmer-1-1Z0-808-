
// Author: Abadhesh Mishra [Employee Id: 8117322]

package Basic;

public class BasicObservation5 {
    public static void main(String[] args) {

        System.out.println("\n\n");

        /*
           Additional Observation for switch case:
           -----------------------------------------
           -> The case value of a switch case can either be a literal 
              or compile time constant or constant expression (i.e.
              expression containing literals or compile time constants
              or both only).
           
           -> Two or more cases cannot have same values or constant expressions
              returning same values.

           -> We can pass 'byte' or 'Byte', 'short' or 'Short', 'char' or 'Character',
              'int' or 'Integer', 'String' and 'enum' values only in switch arguement.
              
           -> The datatype of switch arguement and switch case must match.   
        */

        // Observation 1:
        int code = 101;
        final int finalCode = 101; // Compile Time Constant

        for (int caseCode = 101; caseCode <= 113; caseCode ++) {
        switch(caseCode)
        {
            case 101: 
            System.out.println(code); break;

            case 102: 
            System.out.println(code + 1); break;
                      
            case finalCode + 2:            
            System.out.println(code + 2); break;

            case finalCode + 3:
            System.out.println(code + 3); break;

            case 105:
            //case 105:            // Compilation Error: Two or more cases cannot have same value.
            //case finalCode + 4:  // Compilation Error: Two or more cases cannot have same value.
            System.out.println(code + 4); break;

            case finalCode + 5: 
            System.out.println(code + 5); break;


            default: 
            case finalCode + 6:
            case finalCode + 7:
            case 101 + 8:
            //Compilation Error: Not a constant expression (as variable 'code' is not a compile time constant).
            //case code + 9: 
            //case code + 10:
            System.out.println("No case has been selected."); 
        }}

        System.out.println();

        // Observation 2:
        // Note: The range of 'byte' datatype is from -128 to 127.
        byte sampleByteValue = 120; 

        if(sampleByteValue < 150) // Comparing 'byte' variable with 'int' literal.
           System.out.println("Block 1 executed successfully! :)");

        while(sampleByteValue < 200) // Comparing 'byte' variable with 'int' literal.
        {
           System.out.println("Block 2 executed successfully! :)");
           break;  
        }

        switch(sampleByteValue)
        {
            case 121:
            case 123:
            case 125:
            case 127:
            case (byte)(129):
            /* Compilation Error: As 'byte' variable is passed in switch arguement, 
               the case value must be  within the 'byte' data range (i.e. -128 to 127)
               to become 'byte' value (as switch arguement and switch case data type must
               be the same.) */
            //case 131:
            //case 133:
            default:

            System.out.println("Block 3 executed successfully! :)");
        }

        System.out.println("\n\n");
    }
}
