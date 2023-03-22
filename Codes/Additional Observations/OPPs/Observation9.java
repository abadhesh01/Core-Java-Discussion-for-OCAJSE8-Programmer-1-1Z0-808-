
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
    When two or more overloaded methods have same number of arguements
    but, compatible type arguements, then the order of preference is in
    the following order:

    [1] Exact Match (Highest preference)
    [2] Implicit Casting
    [3] Autoboxing
    [4] Variable Arguement (Lowest preference)
*/

class SampleObservation_A
{
    public void sampleFunction(int... n)
    {
        System.out.println("Variable Arguements");
    }
}

class SampleObservation_B extends SampleObservation_A
{
    public void sampleFunction(Integer n)
    {
        System.out.println("Auto Boxing");
    }

    /*
        This class also contains, 
        [1] public static void sampleFunction(int... n);
        as it extends SampleObservation_A.
    */
}

class SampleObservation_C extends SampleObservation_B
{
    public void sampleFunction(float n)
    {
        System.out.println("Implicit Casting");
    }

    /*
        This class also contains, 
        [1] public static void sampleFunction(int... n);
        [2] public static void sampleFunction(Integer n);
        as it extends SampleObservation_B.
    */
}

public class Observation9 extends SampleObservation_C {

    public void sampleFunction(int n)
    {
        System.out.println("Exact Match");
    }

    /*
        This class also contains, 
        [1] public static void sampleFunction(int... n);
        [3] public static void sampleFunction(Integer n);
        [4] public static void sampleFunction(float n);
        as it extends SampleObservation_C.
    */
   public static void main(String[] args) {
    
        System.out.println("\n");

        new SampleObservation_A().sampleFunction(0); // sampleFunction(int... n);   
        new SampleObservation_B().sampleFunction(0); // sampleFunction(Integer n);
        new SampleObservation_C().sampleFunction(0); // sampleFunction(float n);
        new Observation9().sampleFunction(0); // sampleFunction(int n);

        System.out.println("\n");
   } 
}
