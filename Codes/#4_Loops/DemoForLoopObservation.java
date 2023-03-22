 
public class DemoForLoopObservation {
    public static void main(String[] args) {
 
        /*
            Author: Abadhesh Mishra [Employee Id: 8117322]
            This observation has been informed by "Rishabh Geete [Employee Id: 8115808]."
            
            Observation: "If nothing is provided in the boolean_value or boolean_expression in a for loop only, 
                          the condition by deafult is 'true' and results in an infinite loop." 
        */
        
        int count = 0;
        for(;;)
        {
           System.out.println("Sample Line " + (++count));
        }
    }
}
