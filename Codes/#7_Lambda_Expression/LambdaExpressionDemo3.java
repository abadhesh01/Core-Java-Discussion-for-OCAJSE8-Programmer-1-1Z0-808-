
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.util.concurrent.ThreadLocalRandom;

@FunctionalInterface
interface LambdaTestFace
{
    int lambda();
}

public class LambdaExpressionDemo3 {
    public static void main(String[] args) {
        
        LambdaTestFace face = () -> {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, 100);
            return randomNumber;
         };
     
         LambdaTestFace face2 = () -> {
             return ThreadLocalRandom.current().nextInt(100, 1000);
         };
     
         LambdaTestFace face3 = () -> 
             ThreadLocalRandom.current().nextInt(1000, 10000);

        
         System.out.println("\n");
         System.out.println("Random Number: " + face.lambda());   
         System.out.println("Random Number: " + face2.lambda());
         System.out.println("Random Number: " + face3.lambda()); 
         System.out.println("\n");
    }
}
