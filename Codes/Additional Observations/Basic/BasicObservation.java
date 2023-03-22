
// Author: Abadhesh Mishar [Employee Id: 8117322]

/*
    Observations:
    -------------
    -> Boolean literals and boolean expressions with boolean literals only are evaluated 
       at compile time.

    -> Boolean variables and boolean expressions with boolean variables are evluated 
       at runtime.

    -> If the compiler evaluates a loop(except do...while loop) cannot execute it's own 
       statement(s) (because, condition is already 'false'), there will be a compilation 
       error due to unreachable statement(s) inside the loop block.

    -> If the compiler evaluates a loop(except do...while loop) condition as 'true' and 
       after the loop block, there are other statements to be executed and the loop does not contain 
       a 'break' statement, there will be a compilation error due to unreachable statement(s) 
       after the loop block. To solve compilation error, add a 'break' statement inside the loop.
*/

package Basic;

@SuppressWarnings("all")
public class BasicObservation {
    public static void main(String[] args) {
        
        boolean trueValue = true;
        boolean falseValue = false;

        if(true) {}
        if(false) {System.out.println(falseValue);}

        if(trueValue) {}
        if(falseValue) {System.out.println(falseValue);}

        while(true) {
            break; // Commenting 'break' will make the code unreachable.
        }

        //while(false){}; // Compilation Error: Unreachable code inside the loop.
        
        while(trueValue) {
            break; // Optional.    
        }
        
        while(falseValue) {
            break; // Optional.
        }

        do{
            break; // Commenting 'break' will make the code unreachable.
        } while(true);
        
        do{ 
            break; // Optional.
        }while(false); 
        
        do{
            break; // Optional.
        } while(trueValue);

        do{
            break; // Optional.
        } while(falseValue);

        for(;;){
            break; // Commenting 'break' will make the code unreachable.
        }

        for(;true;){
            break; // Commenting 'break' will make the code unreachable.
        }

        //for(;false;) {} // Compilation Error: Unreachable code inside the loop.

        for(;trueValue;) {
             break; // Optional.
        }

        for(;falseValue;) {
             break; // Optional.
        }

        while(true || true) {
             break; // Commenting 'break' will make the code unreachable.
        }

        while(true || false) {
             break; // Commenting 'break' will make the code unreachable.
        }

        while(false || true) {
             break; // Commenting 'break' will make the code unreachable.
        }

        //while(false || false) {} // Compilation Error: Unreachable code inside the loop.

       while(trueValue || trueValue) {
            break; // Optional.
       }

       while(trueValue || falseValue) {
            break; // Optional.
       }

       while(falseValue || trueValue) {
            break; // Optional.
       }

       while(falseValue || falseValue) {
           break; // Optional.
       }

       while(true && true) {
           break; // Commenting 'break' will make the code unreachable.
       }  

       //while(true && false) {} // Compilation Error: Unreachable code inside the loop.

       //while(false && true) {} // Compilation Error: Unreachable code inside the loop.
       
       //while(false && false) {} // Compilation Error: Unreachable code inside the loop.

       while(trueValue && trueValue) {
           break; // Optional.
       }

       while(trueValue && falseValue) {
           break; // Optional.
       }

       while(falseValue && trueValue) {
           break; // Optional.
       }

       while(falseValue && falseValue) {
           break; // Optional.
       }

       System.out.println("\n\nExecution Successful. :)\n\n");

       while(true){
          break; //Optional. Because there are no further lines to be executed.
       }
    }
}
