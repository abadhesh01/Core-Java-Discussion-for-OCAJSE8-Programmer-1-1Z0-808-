import java.util.concurrent.ThreadLocalRandom;

// Author: Abadhesh Mishra [Employee Id: 8117322]
// Reference: https://www.tutorialspoint.com/java/java_basic_operators.htm

@SuppressWarnings("all")
public class DemoOperators
{
    public static void main(String[] args) {
        /*
                                        ------------------------
                                        Basic Operators in JAVA:
                                        ------------------------
           Definition: "Operators are used to perform different operation(s) between variables or 
                        to manipulate variables."

           The basic operators in Java are:
           (1) Arithmetic Operators (+,-,*,/,%,++,--)
           (2) Assignment Operators (=,+=,-=,*=,/=,%=,>>=,<<=,&=,^=,|=)
           (3) Bitwise Operators (>>,<<,&,^,|,>>>,~)
           (4) Logical Operators (&&,||,!)
           (5) Relational Operators (==,!=,>,<,>=,<=)
           (6) Miscellaneous Operator i.e.
               [datatype] variableName = (boolean expression) ? [value for 'true' result] : [value for 'false' result];          
           
           
           [1] Arithmetic Operators:
           -------------------------
           -------------------------
           Definition: "Arithmetic operators are used in mathematical expressions to perform 
                        arithmetic operations."

            Following are the arithmetic opereators:

            Sl.No.      Operator Name          Operator Symbol          
            ------      -------------          ---------------         
              1          Addition                  +
              2          Subtraction               -
              3          Multiplication            *
              4          Division                  /
              5          Modulus                   %
              6          Increment                 ++
              7          Decrement                 --

        */        

        System.out.println("\n\n[1] Arithmetic Operations:");
        System.out.println("--------------------------");
        int x = 20;
        int y = 10;
        int z = 30;
        System.out.print("[int x = 20; int y = 10; int z = 30;]: ");
        System.out.println(" x = " + x + "; y = " + y + "; z = " + z);
        int output = x + y; 
        System.out.println("[x + y]: " + output);
        output = x - y;
        System.out.println("[x - y]: " + output);
        output = x * y;
        System.out.println("[x * y]: " + output);
        output = x / y;
        System.out.println("[x / y]: " + output);
        output = x % y;
        System.out.println("[x % y]: " + output);
        z ++;
        System.out.println("[z ++]: z = " + z);
        z --;
        System.out.println("[z --]: z = " + z);

        /*
              [2] Assignment Operators:
              -------------------------
              -------------------------
              Definition: "Assignment operators are used to assign a new value to any variable."
              
              Following are the assignment operators:
              
              Sl.No.          Operator Name                              Operator Symbol    
              ------          -------------                              ---------------
                1             Simple Assignment                                 =
                2             Add AND Assignment                                +=
                3             Subtract AND Assignment                           -=
                4             Multiply AND Assignment                           *=
                5             Divide AND Assignment                             /=
                6             Modulus AND Assignment                            %=
                7             Left shift AND Assignment                         <<=
                8             Right shift AND Assignment                        >>=
                9             Bitwise AND Assignment                            &=
                10            Bitwise exclusive OR and Assignment               ^=
                11            Bitwise inclusive OR and Assignment               |=
         */
        
        System.out.println("\n\n[2] Assignment Operations:");
        System.out.println("--------------------------");
        x = 10;
        y = 20;
        z = 0;
        System.out.print("[x = 10; y = 20; z = 0;]: ");
        System.out.println(" x = " + x + "; y = " + y + "; z = " + z);
        z = x + y;
        System.out.println("z = x + y; z = " + z);
        z += x; // z = z + x;
        System.out.println("z += x; z = " + z);
        z -= x; // z = z - x;
        System.out.println("z -= x; z = " + z);
        z *= x; // z = z * x;
        System.out.println("z *= x; z = " + z);
        z /= x; // z = z / x;
        System.out.println("z /= x; z = " + z);
        x = 10;
        z = 15;
        System.out.print("[x = 10; z = 15;]: ");
        System.out.println("x = " + x + "; z = " + z);
        z %= x; // z = z % x;
        System.out.println("z %= x; z = " + z);
        z <<= 2; // z = z << 2;
        System.out.println("z <<= 2; z = " + z);
        z >>= 2; // z = z >> 2;
        System.out.println("z >>= 2; z = " + z);
        z >>= 2; // z = z >> 2;
        System.out.println("z >>= 2; z = " + z);
        z &= x; // z = z & x;
        System.out.println("z &= x; z = " + z);
        z ^= x; // z = z ^ x;
        System.out.println("z ^= x; z = " + z);
        z |= x; // z = z | x;
        System.out.println("z |= x; z = " + z);

        /*
            [3] Bitwise Operators:
            ----------------------
            ----------------------
            Definition: "A Bitwise operator works on bit and performs bit-by-bit operation."
            -> It simply does bit manipulation.
            -> It can be applied to integer types 'byte', 'char', 'short', 'int' and 'long'.
            
            Following are the bitwise operators:

            Sl.No.          Operator Name                                        Operator Symbol
            ------          -------------                                        ---------------
              1             Bitwise and / Binary AND                                  &
              2             Bitwise or / Binary OR                                    |
              3             Bitwise XOR / Binary XOR                                  ^
              4             Bitwise complement / Binary Ones Complement               ~
              5             Left shift / Binary Left Shift                            <<
              6             Right shift / Binary Right Shift                          >>
              7             Zero fill right shift                                     >>>

        */

        System.out.println("\n\n[3] Bitwise Operations:");
        System.out.println("-----------------------");
        x = ThreadLocalRandom.current().nextInt(10, 99);// Generating a random number between 10 to 99.
        y = ThreadLocalRandom.current().nextInt(10, 99);// Generating a random number between 10 to 99.
        System.out.print("[x = ThreadLocalRandom.current().nextInt(10, 99);" +
                         "\ny = ThreadLocalRandom.current().nextInt(10, 99);]: ");
        System.out.println("\nx = " + x + "; y = " + y);
        output = x & y;
        System.out.println("[x & y]: " + output);
        output = x | y;
        System.out.println("[x | y]: " + output);
        output = x ^ y;
        System.out.println("[x ^ y]: " + output);
        output = ~x;
        System.out.println("[~x]: " + output);
        output = x << 2;
        System.out.println("[x << 2]: " + output);
        output = x >> 2;
        System.out.println("[x >> 2]: " + output);
        output = x >>> 2;
        System.out.println("[x >>> 2]: " + output);
    
       /*
            [4] Logical Operators:
            ----------------------
            ----------------------
            Definition: "Logical operators used to evaluate whether an expression is 'true' or 'false'."
            -> Logical operators return a boolean value i.e. either 'true' or 'false'.
            
            Follwing are the logical operators:

            Sl. No.          Operator Name          Operator Symbol
            -------          -------------          ---------------
              1              Logical AND                  &&
              2              Logical OR                   ||
              3              Logical NOT                  !
       */

        System.out.println("\n\n[4] Logical Operations:");
        System.out.println("-----------------------");
        boolean booleanTrue = true;
        boolean booleanFalse = false;
        
        // Simple boolean AND operations.
        System.out.println("[boolean booleanTrue = true; boolean booleanFalse = false]:");
        System.out.println("booleanTrue = " + booleanTrue);
        System.out.println("booleanFalse = " + booleanFalse);
        boolean booleanOutput = booleanTrue && booleanTrue;
        System.out.println("[booleanTrue && booleanTrue]: " + booleanOutput);
        booleanOutput = booleanTrue && booleanFalse;
        System.out.println("[booleanTrue && booleanFalse]: " + booleanOutput);
        booleanOutput = booleanFalse && booleanTrue;
        System.out.println("[booleanFalse && booleanTrue]: " + booleanOutput);
        booleanOutput = booleanFalse && booleanFalse;
        System.out.println("[booleanFalse && booleanFalse]: " + booleanOutput);
        
        // Simple boolean OR operations.
        booleanOutput = booleanTrue || booleanTrue;
        System.out.println("[booleanTrue || booleanTrue]: " + booleanOutput);
        booleanOutput = booleanTrue || booleanFalse;
        System.out.println("[booleanTrue || booleanFalse]: " + booleanOutput);
        booleanOutput = booleanFalse || booleanTrue;
        System.out.println("[booleanFalse || booleanTrue]: " + booleanOutput);
        booleanOutput = booleanFalse || booleanFalse;
        System.out.println("[booleanFalse || booleanFalse]: " + booleanOutput);
        
        // Simple boolean NOT operations.
        booleanOutput = !(booleanTrue);
        System.out.println("[!(booleanTrue)]: " + booleanOutput);
        booleanOutput = !(booleanFalse);
        System.out.println("[!(booleanFalse)]: " + booleanOutput);

        /*
             [5] Relational Operators:
             -------------------------
             -------------------------
             Definition: "Relational operators are used to compare two operands/expressions."
             -> Relational operators return a boolean value i.e. either 'true' or 'false'. 

             Following are some relational operators:

             Sl.No.          Operator Name             Operator Symbol
             ------          -------------             ---------------
               1             Equal to                        ==
               2             Not equal to                    !=
               3             Greater than                    >
               4             Less than                       <
               5             Greater than or equal to        >=
               6             Less than or equal to           <=
        */
  
        System.out.println("\n\n[5] Relational Operations:");
        System.out.println("--------------------------");
        x = 10;
        y = 10;
        z = 30;
        System.out.print("[x = 10; y = 10; z = 30;]: ");
        System.out.println(" x = " + x + "; y = " + y + "; z = " + z);
        booleanOutput = (x == y);
        System.out.println("[x == y]: " + booleanOutput);
        booleanOutput = (y == z);
        System.out.println("[y == z]: " + booleanOutput);
        booleanOutput = (x != y);
        System.out.println("[x != y]: " + booleanOutput);
        booleanOutput = (y != z);
        System.out.println("[y != z]: " + booleanOutput);
        booleanOutput = (y > z);
        System.out.println("[y > z]: " + booleanOutput);
        booleanOutput = (z > y);
        System.out.println("[z > y]: " + booleanOutput);
        booleanOutput = (y < z);
        System.out.println("[y < z]: " + booleanOutput);
        booleanOutput = (z < y);
        System.out.println("[z < y]: " + booleanOutput);
        booleanOutput = (z >= 10);
        System.out.println("[z >= 10]: " + booleanOutput);
        booleanOutput = (z >= 30);
        System.out.println("[z >= 30]: " + booleanOutput);
        booleanOutput = (z >= 40);
        System.out.println("[z >= 40]: " + booleanOutput);
        booleanOutput = (y <= 5);
        System.out.println("[y <= 5]: " + booleanOutput);
        booleanOutput = (y <= 10);
        System.out.println("[y <= 10]: " + booleanOutput);
        booleanOutput = (y <= 15);
        System.out.println("[y <= 15]: " + booleanOutput);

        /*
            [6] Miscellaneous Operators:
            ----------------------------
            ----------------------------
            -> Definition: "Ternary operator evaluates a boolean expression to decide which value will be 
                           assigned to a variable."
            -> Also called as "Conditional Operator" or "Ternary Operator".
            -> It has 3 operands.
            -> Synatx:
                 
            [datatype] variableName = (boolean expression) ? [value for 'true' result] : [value for 'false' result];
        */

        System.out.println("\n\n[6] Ternary Operation:");
        System.out.println("----------------------");
        System.out.println(" x = " + x + "; y = " + y + "; z = " + z);
        int myBitValue = (true) ? 1 : 0;
        System.out.println("[int myBitValue = (true) ? 1 : 0;]: myBitValue = " + myBitValue);
        myBitValue = (false) ? 1 : 0;
        System.out.println("[myBitValue = (false) ? 1 : 0;]: myBitValue = " + myBitValue);
        myBitValue = (x == y) ? 1 : 0;
        System.out.println("[myBitValue = (x == y) ? 1 : 0;]: myBitValue = " + myBitValue);
        myBitValue = (y == z) ? 1 : 0;
        System.out.println("[myBitValue = (y == z) ? 1 : 0;]: myBitValue = " + myBitValue + "\n\n");
      }
}