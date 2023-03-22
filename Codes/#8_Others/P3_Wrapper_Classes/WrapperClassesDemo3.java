
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P3_Wrapper_Classes;

public class WrapperClassesDemo3 {
    public static void main(String[] args) {

        /*
            Boxing:
            -------
            -> Boxing is of 2 types. They are -
               1. Autoboxing : "Converting primitive types to objects."
               2. Unboxing : "Converting objects to primitive types."

            -> Boxing is performed at runtime.   
        */
        
        boolean booleanValue = true;
        char charValue = 'P'; 
        byte byteValue = 120;
        short shortValue = 1001;
        int intValue = 33_303;
        long longValue = 999_999;
        float floatValue = 10.77f;
        double doubleValue = 77.999;

        System.out.println("\nbooleanValue = " + booleanValue);
        System.out.println("charValue = " + charValue);
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        // AutoBoxing
        Boolean booleanObject = booleanValue;
        Character characterObject = charValue;
        Byte byteObject = byteValue;
        Short shortObject =  shortValue;
        Integer integerObject = intValue;
        Long longObject = longValue;
        Float floatObject = floatValue;
        Double doubleObject = doubleValue;

        System.out.println("\nbooleanObject = " + booleanObject);
        System.out.println("characterObject = " + characterObject);
        System.out.println("byteObject = " + byteObject);
        System.out.println("shortObject = " + shortObject);
        System.out.println("integerObject = " + integerObject);
        System.out.println("longObject = " + longObject);
        System.out.println("floatObject = " + floatObject);
        System.out.println("doubleObject = " + doubleObject);
        

        characterObject--;
        byteObject++;
        shortObject--;
        integerObject++;
        longObject--;
        floatObject++;
        doubleObject--;

        // Unboxing
        boolean anotherBooleanValue = booleanObject;
        char anotherCharValue = characterObject;
        byte anotherByteValue = byteObject;
        short anotherShortValue = shortObject;
        int anotherIntValue = integerObject;
        long anotherLongValue = longObject;
        float anotherFloatValue = floatObject;
        double anotherDoubleValue = doubleObject; 

        System.out.println("\nanotherBooleanValue = " + !anotherBooleanValue);
        System.out.println("anotherCharValue = " + anotherCharValue);
        System.out.println("anotherByteValue = " + anotherByteValue);
        System.out.println("anotherShortValue = " + anotherShortValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        System.out.println("anotherLongValue = " + anotherLongValue);
        System.out.println("anotherFloatValue = " + anotherFloatValue);
        System.out.println("anotherDoubleValue = " + anotherDoubleValue + "\n");

    }
}
