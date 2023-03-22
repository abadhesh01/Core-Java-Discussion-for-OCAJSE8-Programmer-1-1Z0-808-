
// Author: Abadhesh Mishra [Employee Id: 8117322]
// Reference: [1] https://www.tutorialspoint.com/java/java_basic_operators.htm
//            [2] https://www.geeksforgeeks.org/operators-in-java/

public class DemoOperators2 {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        /* 
                                                -----------------------------
                                                Some other operators in JAVA:
                                                -----------------------------
                                                (1) Unary Operators
                                                (2) "instanceof" Operator
                                                (3) ".equals()" Operator

             [1] Unary Operators:
             --------------------
             --------------------
             Definition: "Unary operators are used to incerment, decrement or negate a value."
                       -> Unary operators need only one operand.
             
             Following are unary operators:

             Sl.No.     Unary Operator Name     Operator Symbol      Use
             ------     -------------------     ---------------      ---     
               1        Unary Plus                     +             Automatic conversion to 'int' when the type of
                                                                     it's operand is 'byte', 'char' or 'short'.

               2        Unary Minus                    -             Used for negating a value.

               3        Increment Operator             ++            Used for incrementing a value by 1.                                                     
        
               4        Decrement Operator             --            Used for decrementing a value by 1.

               5        Logical NOT                     !            Used for inverting a boolean value.
                                                                     (Same as Logical NOT in Logical Operators.)
            */

            System.out.println("\n\nIncrement and Decrement Operation:");
            System.out.println("----------------------------------");
            
            int x = 0, y = 0, z = 0;
            System.out.println("[int x = 0, y = 0, z = 0;]: x = " + x + ", y = " + y + ", z = " + z);
            
            z = x ++; // "Post increment" i.e. first assign 'x' to 'z' and then increase 'x' by 1.   
            System.out.println("[z = x ++;]: x = " + x + ", y = " + y + ", z = " + z);

            z = y --; // "Post decrement" i.e. first assign 'y' to 'z' and then decrease 'y' by 1.
            System.out.println("[z = y --;]: x = " + x + ", y = " + y + ", z = " + z);

            z = ++ x; // "Pre increment" i.e. first increase 'x' by 1 and then assign 'x' to 'z'.
            System.out.println("[z = ++ x;]: x = " + x + ", y = " + y + ", z = " + z);

            z = -- y; // "Pre decrement" i.e. first decrease 'y' by 1 and then assign 'y' to 'z'.
            System.out.println("[z = -- y;]: x = " + x + ", y = " + y + ", z = " + z);

            /* 
             
                [2] "instanceof" Operator:
                --------------------------
                --------------------------
                Definition: "It is used to cheack whether a object is of a particular class/subclass/interface."
                            -> It returns a boolean value i.e. either 'true' or 'false'.
                
                Syntax:
                
                [object|object_reference] instanceof [class_name|subclass_name|interface_name]
            
            */

            System.out.println("\n\n\"instanceof\" Operation:");
            System.out.println("-----------------------");
            DemoOperators2 dopr = new DemoOperators2();
            System.out.println("DemoOperators2 dopr = new DemoOperators2();\n"
                              + "[dopr instanceof DemoOperators2]: " 
                              + (dopr instanceof DemoOperators2));
            System.out.println("[new DemoOperators2() instanceof DemoOperators2]: " 
                              + (new DemoOperators2() instanceof DemoOperators2));
            // Object class is parent class of all the classes in JAVA.                  
            System.out.println("[dopr instanceof Object]: " + (dopr instanceof Object)); 

            /*
                [3] ".equals()" Operator:
                -------------------------
                -------------------------
                Definition: ".equals() compares the content of two objects."
                            
                             -> Signature: public boolean equals(Object object)
                             
                             -> Note: "Equal to (==) compares the address of two objects and 
                                      .equals() compares the content of two objects."
            */
            
            System.out.println("\n\n\".equals()\" Operation:");
            System.out.println("----------------------");
            Integer i1 = new Integer(10);
            Integer i2 = i1;
            Integer i3 = new Integer(10);
            Integer i4 = new Integer(35);

            System.out.println("[Integer i1 = new Integer(10);\n"
                              + "Integer i2 = i1;\n"
                              + "Integer i3 = new Integer(10);\n"
                              + "Integer i4 = new Integer(35);]:\n");

            System.out.println("i1 = " + i1);                  
            System.out.println("i2 = " + i2); 
            System.out.println("i3 = " + i3); 
            System.out.println("i4 = " + i4); 

            // Comparing address of "Integer" type objects.
            System.out.println("\n[i1 == i2]: " + (i1 == i2));
            System.out.println("[i1 == i3]: " + (i1 == i3));
            System.out.println("[i1 == i4]: " + (i1 == i4));

            // Comparing content of "Integer" type objects.
            System.out.println("\n[i1.equals(i2)]: " + i1.equals(i2));
            System.out.println("[i1.equals(i3)]: " + i1.equals(i3));
            System.out.println("[i1.equals(i4)]: " + i1.equals(i4) + "\n\n");
        }
}
