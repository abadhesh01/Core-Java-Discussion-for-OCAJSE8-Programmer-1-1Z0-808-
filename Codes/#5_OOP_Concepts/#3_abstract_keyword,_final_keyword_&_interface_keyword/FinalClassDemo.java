
// Author: Abadhesh Mishra [Employee Id: 8117322]

// Reference: "Core Java Discussion [Batch 41 and 47 (Team 6)]/Notes/#4_abstract_keyword,_final_keyword_&_interface_keyword.txt"

/* 
    Summary: "final" Class
    ----------------------
    * "final" means non-changable.
    * A "final" class cannot be inherited.
    * All method(s) of a "final" class are by default "final" but, not necessarily the field(s). 
*/

final class NoMod
{
   final String name; 
   static int count;

   void info()
   {
      System.out.println("Object ID: " + this);
      System.out.println("Object Name: " + name);
      System.out.println("Object Hash Code: " + this.hashCode());
   }

   static void showObjectCount()
   {
       System.out.println("Object Count: " + count);
   }

   NoMod()
   {
     name = "default";
     ++count;
   }

   NoMod(String name)
   {
     this.name = name;
     ++count;
   }
}

public class FinalClassDemo //extends NoMod /*Compilation Error: "final" class cannot beinherited.*/ 
{
   public static void main(String[] args) {
    
      System.out.println("\n\n");

      NoMod.showObjectCount();

      System.out.println();

      NoMod mod = new NoMod();
      mod.info();

      System.out.println();
      
      new NoMod().info();

      System.out.println();

      new NoMod().info();

      System.out.println();

      NoMod mod2 = new NoMod("Yuri Boyeka");

      mod2.info();

      System.out.println();

      NoMod.showObjectCount();

      System.out.println();

      // All the method(s) of a 'final' class are 'final' but, not necessarily the field(s).
      NoMod.count = -1; 

      NoMod.showObjectCount();

      System.out.println("\n\n");
   }     
}
