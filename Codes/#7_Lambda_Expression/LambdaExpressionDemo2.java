
// Author: Abadhesh Mishra [Employee Id: 8117322]

@FunctionalInterface
interface LambdaFace2
{
    String lambdaTest(String firstName, String lastName);
}

public class LambdaExpressionDemo2 {
   public static void main(String[] args) {
    
      LambdaFace2 face = (String firstName, String lastName) -> {
          return firstName + " " + lastName;
      };

      LambdaFace2 face2 = (firstName, lastName) -> {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
      };

      LambdaFace2 face3 = (firstName, lastName) -> 
        lastName + " " + firstName;

      System.out.println("\n");

      String sampleFirstName = "Tony";
      String sampleLastName = "Stark";  
     
      System.out.println(face.lambdaTest(sampleFirstName, sampleLastName));
      System.out.println(face2.lambdaTest(sampleFirstName, sampleLastName));
      System.out.println(face3.lambdaTest(sampleFirstName, sampleLastName)); 

      System.out.println("\n");
   }    
}
