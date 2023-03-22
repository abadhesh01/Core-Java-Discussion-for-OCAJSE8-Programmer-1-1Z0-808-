
// Author: Abadhesh Mishra [Employee Id: 8117322]

public class ArraySearchingSortingDemo {
  public static void main(String[] args) {
    
    int intArr[] = {5, 1 , 7, 3, 9};
    int intArr2[];
    //intArr2 = intArr;  
    intArr2 = java.util.Arrays.copyOf(intArr, intArr.length); // Creating anathor copy of 'intArr1'.

    System.out.println("\n\nintArr(" + intArr + "): " + java.util.Arrays.toString(intArr));
    System.out.println("intArr2(" + intArr2 + "): " + java.util.Arrays.toString(intArr2));

    // Sorting 'intArr'.
    System.out.println("\nSorting.......");
    java.util.Arrays.sort(intArr); // The 'Arrays.sort()' in 'java.util' package sorts the provided array.

    System.out.println("\nintArr(" + intArr + "): " + java.util.Arrays.toString(intArr));
    System.out.println("intArr2(" + intArr2 + "): " + java.util.Arrays.toString(intArr2));

    // Searching
    /* 
        Note:
        -----
        -> The condition for 'binarySearch()' is array must be sorted.
        -> If the array is sorted and the element was found, it will return the index of that element.
        -> If the array is sorted and the element was not found, the result is:
           - [(the index where the element could be placed) + 1]
        -> If the array is unsorted, result cannot be predicted.    
    */
    System.out.println("\nbinarySearch(intArr, 5): " 
    + java.util.Arrays.binarySearch(intArr, 5));
    
    System.out.println("\nbinarySearch(intArr, 6): " 
    + java.util.Arrays.binarySearch(intArr, 6));

    System.out.println("\nbinarySearch(intArr2, 5): " 
    + java.util.Arrays.binarySearch(intArr2, 5));
    
    System.out.println("\nbinarySearch(intArr2, 6): " 
    + java.util.Arrays.binarySearch(intArr2, 6) + "\n\n");
  }    
}
