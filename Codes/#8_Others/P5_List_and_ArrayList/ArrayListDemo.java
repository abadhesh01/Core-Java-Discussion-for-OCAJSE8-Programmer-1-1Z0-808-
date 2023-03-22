
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     Reference:
     ----------
     List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html

     ArrayList: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
*/

package P5_List_and_ArrayList;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("\n");

        // Valid 'ArrayList' constructors.
        new ArrayList<>();
        new ArrayList();
        new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        list = new ArrayList<>();

        System.out.println("List Size: " +  list.size());
        System.out.println("List: " + list);

        // Adding elements.....
        list.add("TATA");
        list.add("Tatra");
        list.add(null);
        list.add(3,"Kamaz");
        list.add(null);
        list.add(5, "Kraz");
        list.add("Ashok Leyland");
        list.add(6, "Leyland");

        System.out.println("\nAfter adding elements,");
        System.out.println("List Size: " +  list.size());
        System.out.println("List: " + list);

        // Removing null.....
        System.out.println("\nRemoving element: " + list.remove(null));       

        System.out.println("\nAfter removing an element,");
        System.out.println("List Size: " +  list.size());
        System.out.println("List: " + list);

        // Removing another null.....
        System.out.println("\nRemoving another element: " + list.remove(null));       

        System.out.println("\nAfter removing an element,");
        System.out.println("List Size: " +  list.size());
        System.out.println("List: " + list);

        // Setting some elements.....
        list.set(2, "N/A");
        list.set(3, "N/A");

        System.out.println("\nAfter setting some elements,");
        System.out.println("List Size: " +  list.size());
        System.out.println("List: " + list);

        System.out.println("\nIndex of \"N/A\": " + list.indexOf("N/A"));
        
        // Removing some elements.....
        list.removeAll(list.subList(list.indexOf("N/A"), list.lastIndexOf("N/A")));

        System.out.println("\nAfter removing some elements,");
        System.out.println("List Size: " +  list.size());
        System.out.println("List: " + list);

        // Removing all the elements from the list.....
        list.clear();

        System.out.println("\nAfter removing all elements,");
        System.out.println("List Size: " +  list.size());
        System.out.println("List: " + list);

        System.out.println("\n");
    }
}
