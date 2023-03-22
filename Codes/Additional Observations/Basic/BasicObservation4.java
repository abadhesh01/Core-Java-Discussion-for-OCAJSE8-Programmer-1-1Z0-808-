
// Author: Abadhesh Mishra [Employee Id: 8117322]

package Basic;

@SuppressWarnings("all")
public class BasicObservation4 {
    public static void main(String[] args) {

        /*
           Note for "Compile time constants":
           ----------------------------------
           -> Compile time constants are evaluated during compile time.
           
           -> Rules for Compile time constants:
              [1] Vriables are always 'final'.
              [2] Variables are always of primitive types. 
                  (Because Wrapper classes are unboxed and boxing is performed at runtime.)
              [3] Variable declartion and initialization must be done in the one/same statement.    
              [4] Initialization value must be either a literal or anathor compile time constant. 

            -> Any method arguement(s) with 'final' modifier cannot be considered as
               compile time constant.  
        */
        boolean flag1 = false;
        final boolean flag2 = false; // Compile time constant
        final boolean flag3; flag3 = false;
        final Boolean flag4 = false;
        final boolean flag5 = flag1;
        final boolean flag6 = flag2; // Compile time constant (as 'flag2' is a Compile time constant.)
        final boolean flag7 = getFalseBooleanValue();

        while(flag1);
        /* 
           Compilation Error: 'flag2' is a compile time constant 
           evaluated as 'false' making the loop statements unreachable.  
        */
        //while(flag2); 
        while(flag3);
        while(flag4);
        while(flag5);
        /* 
           Compilation Error: 'flag6' is a compile time constant 
           evaluated as 'false' as 'flag2' assigned to it is a compile 
           time constant making the loop statements unreachable.  
        */
        //while(flag6);
        while(flag7);

        demoWhileLoop(false);
        demoWhileLoop(flag1);
        demoWhileLoop(flag2);
        demoWhileLoop(flag3);
        demoWhileLoop(flag4);
        demoWhileLoop(flag5);
        demoWhileLoop(flag6);
        demoWhileLoop(flag7);
        
        demoFinalWhileLoop(false);
        demoFinalWhileLoop(flag1);
        demoFinalWhileLoop(flag2);
        demoFinalWhileLoop(flag3);
        demoFinalWhileLoop(flag4);
        demoFinalWhileLoop(flag5);
        demoFinalWhileLoop(flag6);
        demoFinalWhileLoop(flag7);

        System.out.println("\n\nExecution Successful.\n\n");
    }
    
    static void demoWhileLoop(boolean flag)
    {
        while(flag);
    }

    static void demoFinalWhileLoop(final boolean flag /*Not a compile time constant.*/)
    {
        while(flag);
    }

    static boolean getFalseBooleanValue()
    {
        return false;
    }
}
