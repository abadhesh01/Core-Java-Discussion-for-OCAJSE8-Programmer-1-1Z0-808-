
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
    Lambda Expression:
    ------------------
    -> Java is an object oriented programming language but, from Java version 8 
       it is possible to implement functional programming using lambda expression.

    -> Lambda expression can be implemented using only functional interface (i.e. an 
       interface with only one abstract method).
       
    -> Hence, the functional interface is not necessary to be implemented by any class
       to use it's abstract method.   
*/

@FunctionalInterface
interface LambdaFace 
{
    String lambdaFunction(Object obj);  
    
    //int lambda(); // A functional interface must have only one abstract method.

    static void staticSampleFunction() {}

    default void defaultSampleFunction() {}
}

public class LambdaExpressionDemo implements LambdaFace
{

    public String lambdaFunction(Object obj)
    {
        return "["+obj+"]: " + "Text from implemented function.";
    }

   public static void main(String[] args) {
 
       LambdaFace face = new LambdaExpressionDemo();

       // Annonymous Innerclass
       LambdaFace face2 = new LambdaFace() {
           public String lambdaFunction(Object obj)
           {
              return "["+obj+"]: " + "Text from annonymous inner class.";
           }
       };

       // Lambda Expressions
       LambdaFace face3 = (Object obj) -> {
            return "["+obj+"]: " + "Text from first(1st) lambda expression."; 
       };

       LambdaFace face4 = (Object obj) -> "["+obj+"]: " + "Text from second(2nd) lambda expression."; 

       LambdaFace face5 = (obj) -> "["+obj+"]: " + "Text from third(3rd) lambda expression.";
   
       LambdaFace face6 = obj -> "["+obj+"]: " + "Text from fourth(4th) lambda expression.";

       System.out.println("\n");
       System.out.println(face.lambdaFunction(new Object()));
       System.out.println(face2.lambdaFunction(new Object()));
       System.out.println(face3.lambdaFunction(new Object()));
       System.out.println(face4.lambdaFunction(new Object()));
       System.out.println(face5.lambdaFunction(new Object()));
       System.out.println(face6.lambdaFunction(new Object()));
       System.out.println("\n");
   }   
}