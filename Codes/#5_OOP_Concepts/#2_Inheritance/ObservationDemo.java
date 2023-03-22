
// Author: Abadhesh Mishra [Employee Id: 8117322]

class MyParent
{
     private String privateText = "Private Text";
     static String staticText = "Static Text";
     final String finalText = "Final Text";

     private void privateFunction()
     {
        System.out.println("Private Function in MyParent.");
     }

     static void staticFunction()
     {
        System.out.println("Static Function in MyParent.");
     }

     final void finalFunction()
     {
        System.out.println("Final Function in MyParent:");
        System.out.print("|_____>");
        System.out.println(privateText);
        System.out.print("|_____>");
        privateFunction();
     }
}

class ChildA extends MyParent
{
    void show()
    {  
       System.out.println("show() Function in ChildA:");
       //System.out.println(privateText); // Compilation Error. "private" members cannot be inherited. 
       System.out.print("|_____>");
       System.out.println(staticText);
       System.out.print("|_____>");
       System.out.println(finalText);
    }
}

class ChildB extends MyParent
{

     private void privateFunction()
     {
        System.out.println("Private Function in ChildB.");
     }

     static void staticFunction()
     {
        System.out.println("Static Function in ChildB.");
        System.out.print("|_____>");
        new ChildB().privateFunction();
     }

}

@SuppressWarnings("all")
public class ObservationDemo {
    public static void main(String[] args) {


        System.out.println("\n\n");
        
        ChildA childA = new ChildA();
        ChildA.staticFunction(); // Accessing partent class staticFunction() through child class name.
        childA.staticFunction(); // Accessing partent class staticFunction() through child class object.
        childA.finalFunction(); // Accessing partent class finalFunction() through child class object.
        childA.show();
        System.out.println(ChildA.staticText); // Accessing partent class staticText through child class name.
        System.out.println(childA.staticText); // Accessing partent class staticText through child class object.
        System.out.println(childA.finalText);  // Accessing partent class finalText through child class object.

        System.out.println("\n\n");

        ChildB childB = new ChildB();
        MyParent childB2 = new ChildB();
        MyParent.staticFunction(); // This will execute staticFunction() in MyParent class.
        ChildB.staticFunction(); // This will execute staticFunction() in ChildB class.
        childB.staticFunction(); // This will execute staticFunction() in ChildB class.
        childB2.staticFunction(); // This will execute staticFunction() in MyParent class.
        childB.finalFunction(); // This will execute finalFunction() in MyParent class.
        childB2.finalFunction(); // This will execute finalFunction() in MyParent class.

        System.out.println("\n\n");
    }
}
