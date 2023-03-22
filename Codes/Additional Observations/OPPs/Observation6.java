
// Author: Abadhesh Mishra [Employee Id: 8117322]

class MyTest
{
    String name = "MyTest";
    String type = "Not Specified.";
}

public class Observation6 extends MyTest
{
    String name = "Observation6";

    public Observation6() 
    {
       //this(); // Compilation Error: Recursive Constructor Call.  

       // 'name' field is present in both parent class and child class.
       // 'type' field is present in parent class only. 
       
       System.out.println("name = " + name); // Accessing 'name' field of child class.
       System.out.println("this.name = " + this.name); // Accessing 'name' field of child class.
       System.out.println("super.name = " + super.name); // Accessing 'name' field of parent class.
       System.out.println("type = " + type); // Accessing 'type' field of parent class.
       System.out.println("this.type = " + this.type); // Accessing 'type' field of parent class.
       System.out.println("super.type = " + super.type); // Accessing 'type' field of parent class.
    }

  public static void main(String[] args) {
     System.out.println("\n\n");
     new Observation6();
     /*
            OUTPUT:
            -------
            name = Observation6
            this.name = Observation6
            super.name = MyTest
            type = Not Specified.
            this.type = Not Specified.
            super.type = Not Specified. 
       */
     System.out.println("\n\n");
  }
}