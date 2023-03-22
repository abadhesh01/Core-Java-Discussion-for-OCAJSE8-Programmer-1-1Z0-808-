// Author: Rishabh Geete [Employee Id: 8115808]

/*Note: In Java, constructor of the parent class with
 no argument gets automatically called in the child class constructor. */

 //Class 1
//Super class
class Parent {
 
    // Constructor of super class
    Parent() {
        System.out.println("Parent Class Constructor.");
    }
}
 
//Class 2
//Sub class
class Child extends Parent {
 
    //Constructor of sub class
    Child() {
        System.out.println("Child Class Constructor.");
    }
}
@SuppressWarnings("all")
public class InheritanceConstructor1 {
    public static void main(String[] args) {
        Child c = new Child();
    }
    
}