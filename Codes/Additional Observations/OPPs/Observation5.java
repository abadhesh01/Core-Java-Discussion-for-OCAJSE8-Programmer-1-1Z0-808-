
// Author: Abadhesh Mishra [Employee Id: 8117322]

class BaseObservation
{

    @SuppressWarnings("all")
    void show(final int n /*Arguement can be declared as 'final'.*/)
    {
        // Child class object can be crerated inside parent class method.
        Observation5 obs5 = new Observation5();
        System.out.println("show() from " + getClass().getName() + ".");
    }

    public BaseObservation()
    {
        show(0);
    }
}

public class Observation5 extends BaseObservation
{
    @Override
    void show(int n)
    {
        System.out.println("show() from " + getClass().getName() + ".");
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        System.out.println("\n\n");
         
        Observation5 observation5 = new Observation5();

        System.out.println();
        
        BaseObservation baseObservation = new BaseObservation();

        baseObservation = observation5;
        baseObservation = (BaseObservation) (observation5); // Same as above line.
        
        observation5 = null;
        baseObservation = observation5; // Same as above line.

        /* 
         * No runrime exception will happen if parent class reference holding 'null'
         * was casted to child class reference.
        */
        baseObservation = null;
        observation5 = (Observation5)(baseObservation);

        System.out.println("\n\n");  
    }
}