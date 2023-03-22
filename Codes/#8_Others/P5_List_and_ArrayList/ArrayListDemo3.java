
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     Reference:
     ----------
     List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html

     ArrayList: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
*/

package P5_List_and_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo3 {
   public static void main(String[] args) {
    System.out.println("\n");

    // Creating an 'ArrayList' object and adding elements to it.
    List<String> list = new ArrayList<>(Arrays.asList("Samsung", "Nokia", 
    "Xaomi", "Oppo", "Vivo", "Motorola", "Lenovo", "Realme", "Oneplus"));

    System.out.println(list + " Size = " + list.size());

    System.out.println("\nRemoving elements ending with 'O'/'o'.....");
    /*
       Note:
       -----
       Removing any element from 'ArrayList' using for-each loop causes
       java.util.ConcurrentModificationException
    */
    
    // Removing all the elements having ending with character either 'O' or 'o'.....
    for (String text : list) {
        char endChar = text.charAt(text.length() -1);
            if(endChar == 'O'|| endChar == 'o')
            {
                list.remove(text);
            }
    }

    System.out.println("\nAfter removing all the elements ending with 'O'/'o',\n" 
        + list + " Size = " + list.size());

    System.out.println("\n");
   }    
}
