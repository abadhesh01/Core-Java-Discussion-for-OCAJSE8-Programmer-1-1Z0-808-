
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

public class ArrayListDemo2 {
   public static void main(String[] args) {
    System.out.println("\n");
    
      /*
         Note:
         -----
         'Arrays.asList()' returns fixed size 'ArrayList' object.
          So, neither an element can be added nor be removed.  
      */
      List<String> list = Arrays.asList("Samsung", "Nokia", 
      "Xaomi", "Oppo", "Vivo", "Motorola", "Lenovo", "Realme", "Oneplus");

      System.out.println(list + " Size = " + list.size());
      
      System.out.println("\nOperating.....");
      try {list.remove(list.size() -1);}catch (Exception e) {System.out.println(e.getClass().getName());}
      try {list.add("Karbon");}catch (Exception e) {System.out.println(e.getClass().getName());}
      try {list.addAll(list);} catch (Exception e) {System.out.println(e.getClass().getName());}

      // Converting fixed sized list to flexible list.
      list = new ArrayList<>(list);

      System.out.println("\n" + list + " Size = " + list.size());

      System.out.println("\nOperating.....");
      try {list.remove(list.size() -1);}catch (Exception e) {System.out.println(e.getClass().getName());}
      try {list.add("Karbon");}catch (Exception e) {System.out.println(e.getClass().getName());}
      try {list.addAll(list);} catch (Exception e) {System.out.println(e.getClass().getName());}

      System.out.println("\n" + list + " Size = " + list.size());

      System.out.println("\n");
   }    
}
