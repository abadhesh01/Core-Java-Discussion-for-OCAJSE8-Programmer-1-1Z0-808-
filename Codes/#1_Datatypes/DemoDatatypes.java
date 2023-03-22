
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class DemoDatatypes
{
    public static void main(String[] args) {
    
        /*
          Datatype: "It specifies the type of the value a variable can hold or a variable is holding."
          --------------------------------------------------------------------------------------------

          Datatypes in Java:
          ------------------
          (1) Primitive Datatype
          (2) Non Primitive Datatype

          Non Primitive Datatypes:
          -------------------------
          (1) Array
          (2) Class
          (3) Interface

          Primitive Datatypes:
          --------------------
          There are 8 primitive datatypes in java.
          ------------------------------------------------------------------------------------------------------
          | Datatype Name | Datatype Syntax | Catagory                 | Size in Bit(s) | Size in Byte(s)      |
          |               |                 |                          |                | (1 Byte = 8 Bits)    |
          -----------------------------------------------------------------------------------------------------|
          | Boolean       |  boolean        |  boolean                 | Not Definded   | Not Defined          |
          -----------------------------------------------------------------------------------------------------|
          | Character     |  char           |  character               |   16           |     2                |
          -----------------------------------------------------------------------------------------------------|
          | Byte          |  byte           |   Numeric(Integer)       |   8            |     1                |
          -----------------------------------------------------------------------------------------------------|
          | Short         |  short          |   Numeric(Integer)       |   16           |     2                |
          -----------------------------------------------------------------------------------------------------|
          | Integer       |  int            |   Numeric(Integer)       |   32           |     4                |
          -----------------------------------------------------------------------------------------------------|
          | Long          |  long           |   Numeric(Integer)       |   64           |     8                |
          -----------------------------------------------------------------------------------------------------|
          | Float         |  float          |   Numeric(Decimal)       |   32           |     4                |
          -----------------------------------------------------------------------------------------------------|
          | Double        |  double         |   Numeric(Decimal)       |   64           |     8                |
          -----------------------------------------------------------------------------------------------------|


          Defaulte values of primitive types:
          -----------------------------------
            Datatype Name         Default Value      
            -------------         -------------
            boolean                false
            char                   '\u0000'
            byte                   0
            short                  0
            int                    0
            long                   0L OR 0l
            float                  0.0F OR 0.0f
            double                 0.0D OR 0.0d

           Maximum and minimum values of datatypes:
           ----------------------------------------  
          */
              System.out.println("\n\nMinimum and Maximum values of primitive datatypes in java:");
              System.out.println("----------------------------------------------------------");

              byte byteMinValue = Byte.MIN_VALUE;
              byte byteMaxValue = Byte.MAX_VALUE;
              System.out.println("\n\nByte Min Value: " + byteMinValue);
              System.out.println("Byte Max Value: " + byteMaxValue);

              short shortMinValue = Short.MIN_VALUE;
              short shortMaxValue = Short.MAX_VALUE;
              System.out.println("\n\nShort Min Value: " + shortMinValue);
              System.out.println("Short Max Value: " + shortMaxValue);
          
              int integerMinValue = Integer.MIN_VALUE;
              int integerMaxValue = Integer.MAX_VALUE;
              System.out.println("\n\nInteger Min Value: " + integerMinValue);
              System.out.println("Integer Max Value: " + integerMaxValue);

              long longMinValue = Long.MIN_VALUE;
              long longMaxValue = Long.MAX_VALUE;
              System.out.println("\n\nLong Min Value: " + longMinValue);
              System.out.println("Long Max Value: " + longMaxValue);

              float floatMinValue = Float.MIN_VALUE;
              float floatMaxValue = Float.MAX_VALUE;
              System.out.println("\n\nFloat Min Value: " + floatMinValue);
              System.out.println("Float Max Value: " + floatMaxValue);

              double doubleMinValue = Double.MIN_VALUE;
              double doubleMaxValue = Double.MAX_VALUE;
              System.out.println("\n\nDouble Min Value: " + doubleMinValue);
              System.out.println("Double Max Value: " + doubleMaxValue + "\n\n");

              char charMinValue = Character.MIN_VALUE; // '/u0000'
              char charMaxValue = Character.MAX_VALUE; // '/uffff'
              System.out.println("\n\nCharacter Min Value: " + charMinValue);
              System.out.println("Character Max Value: " + charMaxValue + "\n\n");


        /*
             Value Representation:
             ---------------------
        */      
             System.out.println("Value Representation:\n---------------------\n\n");

             boolean myBooleanValue = false;
             myBooleanValue = true;
             byte myByteValue = 82;
             short myShortValue = 800;
             int myIntValue = 2023;
             long myLongValue = 33375;
             double myDoubleValue = 63.755;

             // Undserscore can be used just between digits only.
             myByteValue = 1_2_0;
             myShortValue = 20_228;
             myIntValue = 1_10_000;
             // It is not mandatory to provide 'l' or "L" at the end of a 'long' value.
             myLongValue = 700_000L; // 700000l 
             // It is mandatory to provide 'f' or "F" at the end of a 'float' value.
             float myFloatValue = 7_7.073F; // 77.073Ff;
             // It is not mandatory to provide 'd' or 'D' at the end of a 'double' value.
             myDoubleValue = 7_7_7.3_3_3_3D; // 777.3333Dd;
             
             char myCharValue = 'A';
             char myCharValue2 = '\u00E1'; // '\u00e1'

               
            System.out.println("My Boolean Value : " + myBooleanValue);
            System.out.println("My Character Value : " + myCharValue);
            System.out.println("My Character Value 2 : " + myCharValue2);
            System.out.println("My Byte Value : " + myByteValue);
            System.out.println("My Short Value : " + myShortValue);
            System.out.println("My Integer Value : " + myIntValue);
            System.out.println("My Long Value : " + myLongValue);
            System.out.println("My Float Value : " + myFloatValue);
            System.out.println("My Double Value : " + myDoubleValue + "\n\n");

            // Underflow Condition
            System.out.println("Underflow Byte Value : " + (byte) (byteMinValue - 1));
            // Overflow Condition
            System.out.println("Overflow Byte Value : " + (byte) (byteMaxValue + 1) + "\n\n");    
            
            
            /*
               Typecasting in java:
               --------------------
               "Converting a value from one datatype to anathor datatype."

               There are 2 types of type casting. -
               (1) Implicit Casting / Up casting / Automatic Casting -> Converting a lower datatype into a higher datatype. 
               (2) Explicit Casting / Down casting / Manual Casting  -> Converting a higher datatype into a lower datatype.


                                            Implicit Casting
                                            (Widening)
                                            ------------>>>>>

               'byte' <-----> 'short' / 'char' <-----> 'int' <-----> 'long' <-----> 'float' <-----> 'double'
                            
                                            <<<<<-----------
                                            Explicit Casting
                                            (Narrowing)
            */
            
             System.out.println("Type Casting:\n-------------\n\n");

             System.out.println(120); // The default datatype of integer type value is always 'int'.
             System.out.println(133.789); // The default datatype of decimal type value is always 'double'.
             
             byte sampleByteValue = 10; // 'int' value assigned to 'byte' variable.
             short sampleShortValue = 17; // 'int' value assigned to 'short' variable.
             int sampleIntegerValue = 23; // 'int' value assigned to 'int' variable.
             long sampleLongValue = 57; // 'int' value assigned to 'long' variable.
             sampleLongValue = 74L; // 'long' value assigned to 'long' variable.
             double sampleDoubleValue = 17.355; // 'double' value assigned to 'double' variable.
             sampleDoubleValue = 388.752D; // 'double' value assigned to 'double' variable.
             sampleDoubleValue = 666.5F; // 'float' value assigned to 'double' variable.
             float sampleFloatValue = 13.333F; // 'float' value assigned to 'float' variable.
             System.out.println("sampleByteValue: " + sampleByteValue);
             System.out.println("sampleShortValue: " + sampleShortValue);
             System.out.println("sampleIntegerValue: " + sampleIntegerValue);
             System.out.println("sampleLongValue: " + sampleLongValue);
             System.out.println("sampleFloatValue: " + sampleFloatValue);
             System.out.println("sampleDoubleValue: " + sampleDoubleValue);

             // Implicit Casting
             byte byteValue = 10;
             short shortValue = byteValue;
             int intValue = byteValue;
             intValue = shortValue;
             long longValue = byteValue;
             longValue = shortValue;
             longValue = intValue;
             float floatValue = sampleFloatValue;
             floatValue = intValue;
             floatValue = longValue;
             floatValue = 775L;
             double doubleValue = floatValue;  
             
             // Explicit Casting
             byteValue = (byte) intValue;
             shortValue = (short) intValue;
             intValue = (int) longValue;
             floatValue = (float) doubleValue;
             

             /* Casting in mathemetical expression:
                -----------------------------------
                (1) A mathemetical expression will always return either 'int', 'long', 'float' or 'double' value depending 
                    on the wide most data.
                (2) A mathematical expression cannot return 'byte' or 'short' value.
              */ 
             byteValue =  (byte) shortValue; // Not an methematical expression.
             byteValue =  (byte) /*Expression returns 'int' value*/ (shortMaxValue + shortMinValue);
             byteValue =  (byte) /*Expression returns 'int' value*/ (byteValue + 1);
             byteValue =  (byte) /*Expression returns 'int' value*/ (byteValue + shortValue); 
             byteValue =  (byte) /*Expression returns 'int' value*/ (byteValue + shortValue + intValue); 
             byteValue =  (byte) /*Expression returns 'long' value*/ (byteValue + shortValue + intValue + longValue);
             longValue =  (byte) /*Expression returns 'float' value*/ (longValue + floatValue);
             longValue =  (byte) /*Expression returns 'double' value*/ (longValue + floatValue + doubleValue);
             floatValue = (floatValue + 1L);
             floatValue = (longValue + 1);
             floatValue = (float) /*Expression returns 'double' value*/ (floatValue + doubleValue);
             doubleValue = (floatValue + doubleValue);
          
             // ASCII (American Standard Code for Information Interchange)
             char charValue = 65;
             System.out.println("\n\n[char charValue = 65]\ncharValue : " + charValue);
             charValue =  (char) (charValue + 4);
             System.out.println("[charValue = (char) (charValue + 4)]\ncharValue : " + charValue);
             charValue = 'E' + 3; // Exception in casting rule.
             System.out.println("[charValue = 'E' + 3]\ncharValue : " + charValue);             
             intValue = charValue;
             System.out.println("[intValue = charValue]\nintValue : " + intValue + "\n\n");

             /*  Assigning single character to variables of 'byte', 'short', 'int', 'long', 'float' and 'double':
                 ------------------------------------------------------------------------------------------------   
                (1) Characters and Integers are interchangeable.
                (2) A 'int' or 'char' value assigned to 'byte', 'short', 'int', 'long', 'float' or 'double'
                    variable is always considered as 'int'.
                (3) A 'int' or 'char' value assigned to a 'char' variable is always considered as 'char'.   
            */
             System.out.println("\n\nIntegers and Characters are interchangeable:");
             System.out.println("------------------------------------------------");
             byte byteChar = 'A';
             short shortChar = 'B';
             int intChar = 'C';
             long longChar = 'D';
             float floatChar = 'E';
             double doubleChar = 'F';
             System.out.println("byteChar : " + byteChar);
             System.out.println("shortChar : " + shortChar);
             System.out.println("intChar : " + intChar);
             System.out.println("longChar : " + longChar);
             System.out.println("floatChar : " + floatChar);
             System.out.println("doubleChar : " + doubleChar);
             byteChar = 71;
             shortChar = 72;
             intChar = 73;
             longChar = 74;
             floatChar = 75;
             doubleChar = 76; 
             System.out.println("____________________________________________");
             System.out.println("byteChar : " + byteChar);
             System.out.println("shortChar : " + shortChar);
             System.out.println("intChar : " + intChar);
             System.out.println("longChar : " + longChar);
             System.out.println("floatChar : " + floatChar);
             System.out.println("doubleChar : " + doubleChar + "\n\n");
        }
}