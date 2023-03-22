
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.util.Arrays;

@SuppressWarnings("all")
public class ArrayDemo
{

  // This method prints each and every element of the provided array.  
  public static void printArrya(int intArr[])
  {
    System.out.println("\n\n");

    System.out.println(intArr + "\nLength of the array = " + intArr.length);

    String text = "|";
    for(int element: intArr)
       text += element + "|";  
    System.out.println(text);   

    System.out.println(Arrays.toString(intArr));

    System.out.println("\n\n");
  } 

  public static void main(String[] args) {
    
    // Correct form of array initialization.
    int intArr[] = {0, 1, 2, 3, 4};
    int intArr2[] = new int[5 /*Only values of type 'int' is allowed.*/];
    int intArr3[] = new int[] {11, 22, 33, 44, 55};
    
    printArrya(intArr);
    printArrya(intArr2);
    printArrya(intArr3);

    for(int index = 0; index < intArr2.length; index ++)
        intArr2[index] = - (index - 1);
    
    printArrya(intArr2);
    
    // Correct form of array declaration.
    int intArr4[];
    int []intArr5;
    int intArr6[], a, b;// Here "intArr6" is an array and "a" and "b" are variable of type 'int'.
    int[] intArr7, x, y, z = {};// Here "intArr7" , "x", "y" and "z" are arrays.
    
    intArr6 = new int[] {66, 77, 88};
    a = 99; 
    b = 111;
    intArr7 = intArr6;
    x = new int [] {};
    //y = {};//Compilation Error:  Array constants can only be used in initializers.
    y = new int [0];

  }
}