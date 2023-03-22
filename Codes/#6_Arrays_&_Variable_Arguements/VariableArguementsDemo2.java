
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.util.Arrays;

/*  
    Note:
    -----
    -> There can be only one variable arguement in a method and if the method
       contains multiple arguements, it should be the last arguement only.

    -> The method with variable arguement always has less prioroty than method with normal arguement(s).      
*/
@SuppressWarnings("all")
public class VariableArguementsDemo2 {

    void showNum(int n) { System.out.println("\nn = " + n +"\n");}
    void showNum(int... n) { System.out.println("\nArray length: " + n.length + "\n" + Arrays.toString(n) + "\n");}
    
      
        /*  
           Note: showNum(int... n) & showNum(int start, int... n) is causing ambiguity.
           -> Both can be kept and the code will compile successfully.
           -> But compilation error will arise if either of the method was called at a time.  
        */ 
        /*
        void showNum(int start, int... n) {
        System.out.println("\nStart = " + start);
        System.out.println("Array length: " + n.length + "\n" + Arrays.toString(n) + "\n");}
         */   
    
    //void showNum(int...n, int start) {} // Compilation Error: Incorrect Syntax
    //void showNum(int... x, int... y) {} // Compilation Error: Incorrect Syntax
   
    /* Both of the below 2 lines (line 37 & 38) are same, but only one can be kept at a time.*/
   
    //void showNum(int intArr[], int intArr2[]) {}
    void showNum(int intArr[], int... intArr2) {
         System.out.println("\nArray_1: " + Arrays.toString(intArr) + ", length = " + intArr.length);
         System.out.println("Array_2: " + Arrays.toString(intArr2) + ", length = " + intArr2.length + "\n");
    }

    public static void main(String... args) {

        int intArr[] = {-11, -22, -33, -44, -55, -66, -77};
    
        VariableArguementsDemo2 va = new VariableArguementsDemo2();
        
        va.showNum(337);
        va.showNum(intArr);
        va.showNum(-777, 0, 1, 2, 3, 4);// Ambiguity due to showNum(int... n) & showNum(int start, int... n).
        va.showNum(0,1,2);// Ambiguity due to showNum(int... n) & showNum(int start, int... n).
        va.showNum(11, 22, 33, 44, 55);// Ambiguity due to showNum(int... n) & showNum(int start, int... n).
        va.showNum(intArr, intArr);
        va.showNum(intArr, new int[5]);
        va.showNum(intArr, new int[] {-333, -222, -111});
        va.showNum(intArr, 990, 880, 770);
        va.showNum(new int[]{}, new int[]{});
        //va.showNum(intArr, {-333, -222, -111}); // Compilation Error: Incorrect Syntax
        //va.showNum({-333, -222, -111}, intArr); // Compilation Error: Incorrect Syntax
        //va.showNum({},{}); // Compilation Error: Incorrect Syntax
        va.showNum(); 
        va.showNum(null); // Compiles successfully but throws NullPointerException.
    }
}
