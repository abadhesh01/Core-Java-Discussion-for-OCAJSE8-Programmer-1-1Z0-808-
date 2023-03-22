
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     Summary:
     -------- 
     [1] Within the same class a static method as well as a non-static method can call a static method
         either directly or through class name or through object(s).

     [2] Within the same class a static method can call a non-static method only through object(s).
     
     [3] Within the same class a non-static method can call anathor non-static method either directly or through object(s).

     * Same rule is valid for calling of static variable(s) as well as instance variable(s). 
 */

@SuppressWarnings("all")
public class ClassDemoObservation1 {

    // static method
    static void staticFunction()
    {
        System.out.println("staticFunction()");
    }

    // non-static method
    void nonStaticFunction()
    {
        System.out.println("nonStaticFunction()");      
    }

    void call()
    {
        ClassDemoObservation1 obj = new ClassDemoObservation1();

       /*
          Observation 3:
          --------------
          Within same class a non-static method can call a static method in the following 3 ways:
          (1) Directly
          (2) Through class name
          (3) Through object(s) 
       */

       staticFunction(); 
       ClassDemoObservation1.staticFunction();
       obj.staticFunction();

       System.out.println("\n\n");
         
       /*
          Observation 4:
          --------------
          Within same class a non-static method can call anathor non-static method in the following 2 ways:
          (1) Directly
          (3) Through object(s) 
       */

       nonStaticFunction(); 
       //ClassDemoObservation1.nonStaticFunction(); // Compilation Error
       obj.nonStaticFunction();
    }

   public static void main(String[] args) {

      ClassDemoObservation1 obj = new ClassDemoObservation1();

       /*
          Observation 1:
          --------------
          Within same class a static method can call anathor static method in the following 3 ways:
          (1) Directly
          (2) Through class name
          (3) Through object(s)
       */

       staticFunction(); 
       ClassDemoObservation1.staticFunction();
       obj.staticFunction();

       System.out.println("\n\n");

       /*
          Observation 2:
          --------------
          Within same class a static method can call a non-static method 
          only through object(s).
       */

       //nonStaticFunction(); // Compilation Error
       //ClassDemoObservation1.nonStaticFunction(); // Compilation Error
       obj.nonStaticFunction(); 

       System.out.println("\n\n");

       obj.call(); // For Observation 3 & 4 read the statements and comments in call() method.
   }   
}
