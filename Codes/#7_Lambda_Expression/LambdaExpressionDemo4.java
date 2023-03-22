
// Author: Abadhesh Mishra [Employee Id: 8117322]

// Reference: https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings("all")
public class LambdaExpressionDemo4 implements Predicate {
    
    public static void main(String[] args) {

        System.out.println("\n");
        
        LambdaExpressionDemo4 obj = new LambdaExpressionDemo4();
        Object obj2 = "Sample Text";
        Object number1 = 11;
        Object number2 = 22;
        Object number3 = 33;
        Object number4 = 44;
        Object number5 = 55;
        
        System.out.println(obj.test(obj));
        System.out.println(obj.test(obj2));
        System.out.println(obj.test(number1));
        System.out.println(obj.test(number2));
        System.out.println(obj.test(number3));
        System.out.println(obj.test(number4));
        System.out.println(obj.test(number5));

        List<Object> objects = new ArrayList<>
        (Arrays.asList(obj, obj2, number1, number2, number3, number4, number5));

        System.out.println("\n" + objects.toString() + "\n");

        objects.removeIf(obj);

        System.out.println("\n" + objects.toString());

        Predicate lambdaPrdicate = listObjects -> !(listObjects instanceof Integer); 

        objects.removeIf(lambdaPrdicate); // Passing lamda expression as a reference.

        System.out.println("\n" + objects.toString());

        // Passing lamda expression directly.
        objects.removeIf(myListObjects -> myListObjects instanceof Integer);

        System.out.println("\n" + objects.toString());

        System.out.println("\n");
    }

    @Override
    public boolean test(Object t) {

        System.out.println("The object is : \"" + t 
        + "\" of type \"" + t.getClass().getName() + "\".");
        
        if(t instanceof Integer)
        {
            Integer numberObject = (Integer) (t);
            int number = numberObject.intValue();
            
            if(number % 2 == 0)
               return true;
        }

        return false;
    }
}
