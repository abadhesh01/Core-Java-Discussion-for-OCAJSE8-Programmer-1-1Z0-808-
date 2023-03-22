
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
   Note:
   -----
   -> An interface can extend two or more interfaces having fields with the same name.
   
   -> A class can implement two or more interfaces having fields with the same name.
   
   -> A class cannot call it's parent interface member(s) through 'super' keyword. 
   
   -> A class cannot call it's parent interface 'static' methods directly (but, 
      only through interface name but, a class can call it's parent interface fields
      directly or through interface name.)      
*/

interface IfaceA
{
   long faceNumber = 65;
}

interface IfaceB
{
    long faceNumber = 90;
}

// An interface extending anathor 2 interfaces having fields with the same name.
//abstract // Optional 
interface IfaceC extends IfaceA, IfaceB {}

// A class implementing 2 interfaces having fields with the same name.
class FaceD implements IfaceA, IfaceB {}
 
// An interface extending anathor 2 interfaces having fields with the same name
// and also defining the same field name.
interface ChildIface extends IfaceA, IfaceB
{
    long faceNumber = 108; 
    String faceName = "Child Face";

    static void staticShow()
    {
        System.out.println("staticShow() from ChildIface.");
    }
    
    default void display()
    {
        String text = "display() from ChildIface with faceNumber = " + faceNumber + 
        ", IfaceA.faceNumber = " + IfaceA.faceNumber + 
        ", IfaceB.faceNumber = " + IfaceB.faceNumber +
        "."; 
        System.out.println(text);
    }
}

@SuppressWarnings("all")
class IfaceObj implements  
ChildIface
,
IfaceA
,
IfaceB
{
    public IfaceObj()
    {
       System.out.println("faceName: " + faceName);
       System.out.println("ChildIface.faceName: " + ChildIface.faceName);
       //System.out.println("faceNumber: " + faceNumber);// Compilation Error: 'faceNumber' is ambiguous.
       System.out.println("ChildIface.faceNumber: " + ChildIface.faceNumber);  
       //super.display(); // Compilation Error: 'super' cannot refer to an interface.
       display(); 
       //staticShow(); // Compilation Error: 'static' method of parent interface cannot be invoked directly.  
       ChildIface.staticShow();    
    }    
}

public class Observation4
{
    public static void main(String[] args) {
         System.out.println("\n\n");
         
         new IfaceObj();       

         System.out.println("\n\n");
    }
}