
// Author: Abadhesh Mishra [Employee Id: 8117322]

// Reference: "Core Java Discussion [Batch 41 and 47 (Team 6)]/Notes/#4_abstract_keyword,_final_keyword_&_interface_keyword.txt"

interface SimpleInteface
{
   String name = "Abadhesh Mishra"; 
   static String id = "1841012095";
   final String branch = "B-Tech: Computer Science & Engineering";
   static final String institute = "ITER, S'O'A Univertity, BBSR";

   // 'default' method(s) can have implementation inside an 'interface' without affecting it.
   default void displayDetails()
   {
       System.out.println("Name: " + name);
       System.out.println("Id: " + id);
       System.out.println("Branch: " + branch);
       System.out.println("Institute: " + institute);
   }

   // An 'interface' can contain 'static' method also.
   static void writeMessage(String message)
   {
      System.out.println("Message(SimpleInteface): " + message);
   }

   // 'abstract' method.
   void defineMe();

}

interface SimpleInteface2 
{}

interface SimpleInteface3 
{
   // 'abstract' method. 
   void defineMe();
}

// A 'interface' can extend anathor 'interface'.
interface SimpleInteface4 extends SimpleInteface3
{
    // 'default' method(s) can have implementation inside an 'interface' without affecting it.
   default void displayDetails()
   {
      System.out.println("No details found! :(");
   }
}

// A class can extend multiple 'interface's.
public class InterfaceDemo implements SimpleInteface, SimpleInteface2, SimpleInteface4 {
   public static void main(String[] args) {
    
     /* 
        In Java, we cannot create the object(s) of "abstract" class and "interface".
        But, technically it's possible through "anonymous inner class".
     */
     // Annonymous Inner Class
       SimpleInteface simpleInteface = new SimpleInteface() {
        @Override
        public void defineMe() {
            System.out.println("Object Id: " + this);
            System.out.println("Object Hash Code: " + this.hashCode());
        }   
       };

       System.out.println("\n\n");

       simpleInteface.defineMe();

       System.out.println();

       simpleInteface.displayDetails();

       System.out.println();

       SimpleInteface.writeMessage("Calling through inteface name.");

       System.out.println("------------------------------------------------------------------------------------");

       simpleInteface = new InterfaceDemo();

       simpleInteface.defineMe();

       System.out.println();

       simpleInteface.displayDetails();

       System.out.println();

       SimpleInteface.writeMessage("Calling through inteface name.");

       System.out.println("\n\n");
   }

   // Redefining 'default' method in 'interface' "SimpleInterface".
   public void displayDetails()
   {
       System.out.println("Nothing to display!");
   }

   // Redefining 'static' method in 'interface' "SimpleInteface".
   static void writeMessage(String message)
   {
      System.out.println("Message(InterfaceDemo): " + message);
   }

   // Overridden Method.
   @Override
   public void defineMe() {
    System.out.println("I'm " + this + ". :)"); 
   }
}
