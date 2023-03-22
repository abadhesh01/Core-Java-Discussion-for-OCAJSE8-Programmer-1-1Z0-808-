
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

@SuppressWarnings("all")
public class WrapperClassesDemo {

    public static void printNumbers(Number... numbers)
    {

        /*
            Note:
            -----
            -> 'Number' class is an 'abstract' parent class of 'Byte', 'Short', 'Integer',
               'Long', 'Float' and 'Double' classes.
            
            ->  It has the following methods:
                1. byte byteValue()
                2. short shortValue()
                3. abstract int intValue()
                4. abstract long longValue()
                5. abstract float floatValue()
                6. abstract double doubleValue()  

            -> 'Number' class methods are either inherited or overridden by it's child classes.   
            
            -> For more refer to:
               https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html
        */

        System.out.println("\n");

        for (Number numberObject : numbers) {

            byte b = numberObject.byteValue();
            short s = numberObject.shortValue();
            int i = numberObject.intValue();
            long l = numberObject.longValue();
            float f = numberObject.floatValue();
            double d = numberObject.doubleValue();

            String output = numberObject.getClass().getName() + " = " + numberObject + "\n";
            output += "[byteValue = " + b;
            output += ", shortValue = " + s;
            output += ", intValue = " + i;
            output += ", longValue = " + l;
            output += ", floatValue = " + f;
            output += ", doubleValue = " + d + "]\n";

            System.out.println(output);
        }
    }

    public static void printBoolean(Boolean... booleans)
    {
        System.out.println("\n");

         for (Boolean booleanObject : booleans) {
             boolean booleanValue = booleanObject.booleanValue();
             System.out.println("booleanValue = " + booleanValue + ", booleanObject = " + booleanObject);
         }
    }

    public static void main(String[] args) {

        System.out.println();

        /*
            Wrapper Classes:
            ----------------
            -> Wrapper classes wrapes around the data.
               It is used to convert primitive types to objects and vice versa.
               
            -> Following are the wrapper classes:
               1. Boolean
               2. Character
               3. Number 
               4. Child classes of 'Number':
                  4.1. Byte 
                  4.2. Short
                  4.3. Integer
                  4.4. Long
                  4.5. Float
                  4.6. Double     
        */

          // Boolean
          // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
        
          Boolean myBoolean = new Boolean(true); // Output: true
          Boolean myBoolean2 = new Boolean("true"); // Output: true
          Boolean myBoolean3 = new Boolean("TrUe"); // Output: true
          Boolean myBoolean4 = Boolean.valueOf(true); // Output: true
          Boolean myBoolean5 = Boolean.valueOf("true"); // Output: true
          Boolean myBoolean6 = Boolean.valueOf("TRue"); // Output: true
          Boolean myBoolean7 = Boolean.parseBoolean("true"); // Output: true
          Boolean myBoolean8 = Boolean.parseBoolean("TruE"); // Output: true         
         
          printBoolean(myBoolean, myBoolean2, myBoolean3, myBoolean4, 
                       myBoolean5, myBoolean6, myBoolean7, myBoolean8);

          myBoolean = new Boolean(false); // Output: false
          myBoolean2 = new Boolean("false"); // Output: false
          myBoolean3 = new Boolean("FaLsE"); // Output: false
          myBoolean4 = Boolean.valueOf(false); // Output: false
          myBoolean5 = Boolean.valueOf("false"); // Output: false
          myBoolean6 = Boolean.valueOf("FALse"); // Output: false
          myBoolean7 = Boolean.parseBoolean("false"); // Output: false
          myBoolean8 = Boolean.parseBoolean("FalsE"); // Output: false
          Boolean myBoolean9 = new Boolean(null); // Output: false
          Boolean myBoolean10 = Boolean.valueOf(null); // Output: false
          Boolean myBoolean11 = Boolean.parseBoolean(null); // Output: false
          Boolean myBoolean12 = new Boolean("Abc"); // Output: false
          Boolean myBoolean13 = Boolean.valueOf("Ghi"); // Output: false
          Boolean myBoolean14 = Boolean.parseBoolean("Xyz"); // Output: false

          printBoolean(myBoolean, myBoolean2, myBoolean3, myBoolean4, 
                       myBoolean5, myBoolean6, myBoolean7, myBoolean8,
                       myBoolean9, myBoolean10, myBoolean11, myBoolean12,
                       myBoolean13, myBoolean14);

          // Character             
          // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

          Character characterObject = new Character('G'); // Output: G
          Character characterObject2 = Character.valueOf('g'); // Output: g
          char characterValue = characterObject.charValue(); // Output: G
          char characterValue2 = characterObject2.charValue(); // Output: g
          
          System.out.println("\ncharacterValue = " + characterValue 
          + ", characterObject = " + characterObject);              
          System.out.println("characterValue2 = " + characterValue2 
          + ", characterObject2 = " + characterObject2);

        // Number
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html  

        // Byte
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
        Byte myByte = new Byte((byte)100);
        Byte myByte2 = new Byte("127");

        // Short
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html
        Short myShort = new Short((short)575);
        Short myShort2 = new Short("1001");
        
        // Integer
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
        Integer myInteger = new Integer("33333");
        Integer myInteger2 = new Integer(44_400);

        // Long
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html
        Long myLong = new Long(100_000);
        Long myLong2 = new Long("500550");

        // Float
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html
        Float myFloat = new Float(10.555f);
        Float myFloat2 = new Float(77.777);
        Float myFloat3 = new Float("-33.57641");

        // Double 
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
        Double myDouble = new Double(100_01.70_771);
        Double myDouble2 = new Double("1234.567090");

        printNumbers(
        myByte, myByte2,
        myShort, myShort2,    
        myInteger, myInteger2,
        myLong, myLong2,
        myFloat, myFloat2, myFloat3,
        myDouble, myDouble2);

        System.out.println();               
    }
}
