
// Author: Abadhesh Mishra [Employee Id: 8117322]

// For more refer to : "Core Java Discussion [Batch 41 and 47 (Team 6)]/Codes/#5_OOP_Concepts/#2_Inheritance.txt"

class Alpha
{
   String text = "Alpha Text";

   // Overridden Mehod
   Object myFunction()
   { 
      System.out.println("Alpha Dummy Function");
      System.out.println("text: " + text);
      return 0;
   }
}

class Bravo extends Alpha
{
   String text = "Bravo Text";

   // Overridden Mehod
   Number myFunction()
   { 
      System.out.println("Bravo Dummy Function");
      System.out.println("text: " + text);
      System.out.println("super.text: " + super.text);
      super.myFunction();
      return 0.0d;
   }

}

class Charlie extends Bravo
{
   String text = "Charli Text";

   // Overridden Mehod
   protected Integer myFunction()
   { 
      System.out.println("Charlie Dummy Function");
      System.out.println("text: " + text);
      System.out.println("super.text: " + super.text);
      super.myFunction();
      return null;
   }
}

class Delta extends Charlie
{
    String text = "Delta Text";
    String message = "I am the bottom most class in the hierchy.";

    // Overridden Mehod
    public Integer myFunction()
    { 
      System.out.println("Delta Dummy Function");
      System.out.println("text: " + text);
      System.out.println("super.text: " + super.text);
      super.myFunction();
      return 0;
    }

    void deltaCall()
    {
        System.out.print("deltaCall() @ ");
        System.out.println(this); // This will print the address of "Delta" object as "this" refers to object.
        //System.out.println(super); // This will result in a compilation error as it does not refer to any object.
    }

}

public class InheritanceDemo3 {
    public static void main(String[] args) {
        
        // A Parent class reference can hold a child class object.
        // Here 'alpha' is a 'Alpha' class reference reffering to a 'Delta' class object.
        Alpha alpha = new Delta();  
        alpha.myFunction();
        /*  
           The reference of parent class holding the object of child class cannot access
           the non-overridden method and variables of child class.
        */
        //alpha.deltaCall();  // Compilation Error                    
        //System.out.println(alpha.message); // Compilation Error
         
        System.out.println("\n\n");

        // Cating of Objects:
        //-------------------
        // A parent class reference holding a child class object can be casted into a child class reference only.
        // Here 'alpha' is a 'Alpha' class reference reffering to a 'Delta' class object.
        // Here 'delta' is a 'Delta' class reference reffering to a 'alpha' class reference casted to 'Delta' type.
        Delta delta = (Delta) alpha;  
        delta.myFunction();
        delta.deltaCall();
        System.out.println(delta.message);

        System.out.println("\n\n");

        // A child class reference cannot hold a parent class object.
        // Here 'delta' is a 'Delta' class reference reffering to a 'Alpha' class object.
        //delta = new Alpha(); // Compilation Error 
        

        // A parent class object cannot be casted into a child class object.
        /*
           The below statement will compile successfully but, will result in "java.lang.ClassCastException" 
           which is a runtime exception/unchecked exception. 
        */
        //delta = (Delta)(new Alpha()); 

    }
}
