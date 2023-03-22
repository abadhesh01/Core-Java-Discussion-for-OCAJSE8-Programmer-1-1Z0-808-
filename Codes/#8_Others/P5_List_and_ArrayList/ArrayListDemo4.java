
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

public class ArrayListDemo4 {
    public static void main(String[] args) {
        System.out.println("\n");
    
        // Creating an 'ArrayList' object and adding elements to it.
        List<String> list = new ArrayList<>(Arrays.asList("Samsung", "Nokia", 
        "Xaomi", "Oppo", "Vivo", "Motorola", "Lenovo", "Realme", "Oneplus"));
    
        System.out.println(list + " Size = " + list.size());
    
        System.out.println("\nRemoving elements ending with 'O'/'o'.....");
        
        // Any one of the below 3 iertaor will work. 
        java.util.Iterator<String> iterator = list.listIterator();
        //java.util.Iterator<String> iterator = list.iterator();
        //java.util.ListIterator<String> iterator = list.listIterator();
        
        // Removing all the elements having ending with character either 'O' or 'o'.....
        while(iterator.hasNext())
        {
            String text = iterator.next();   
            
            char endChar = text.charAt(text.length() -1);
            if(endChar == 'O'|| endChar == 'o')
            {
                iterator.remove();
            }   
        }
    
        System.out.println("\nAfter removing all the elements ending with 'O'/'o',\n" 
        + list + " Size = " + list.size());
    
        System.out.println("\n");
       }    
}
