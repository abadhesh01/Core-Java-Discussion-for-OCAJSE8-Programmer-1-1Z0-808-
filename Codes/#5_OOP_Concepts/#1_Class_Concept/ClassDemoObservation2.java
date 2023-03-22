
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     Summary:
     --------
     [1] Within different classes a static method as well as a non-static method can call anthor static method 
         either through class name or through object(s).
     
     [2] Within different classes a static method as well as a non-static method can call anthor non-static method 
         only through object(s).    

     * Same rule is valid for calling of static variable(s) as well as instance variable(s).    
*/

class SampleTemplate
{
    // static method
    static void staticCall()
    {
        System.out.println("staticCall()");
    }   

    // non-static method
    void nonStaticCall()
    {
        System.out.println("nonStaticCall()");
    }
}

@SuppressWarnings("all")
public class ClassDemoObservation2 {

    void call(SampleTemplate sTemplate)
    {
        /* 
           Observation 3:
           --------------
           Within different classes a non-static method can call a static method 
           either through class name or through object(s).
        */
        SampleTemplate.staticCall();
        sTemplate.staticCall();
        
        /* 
           Observation 4:
           --------------
           Within different classes a non-static method can call anathor non-static method 
           only through object(s).
        */
        // SampleTemplate.nonStaticCall(); // Compilation Error
        sTemplate.nonStaticCall();
    }

    public static void main(String[] args) {

        SampleTemplate sTemplate = new SampleTemplate();    

        /* 
           Observation 1:
           --------------
           Within different classes a static method can call anathor static method 
           either through class name or through object(s).
        */
        SampleTemplate.staticCall();
        sTemplate.staticCall();
        
        /* 
           Observation 2:
           --------------
           Within different classes a static method can call a non-static method 
           only through object(s).
        */
        // SampleTemplate.nonStaticCall(); // Compilation Error
        sTemplate.nonStaticCall();

        System.out.println("\n\n");

        // This is an orphan object as it has no reference to it.
        new ClassDemoObservation2().call(sTemplate); // For Observation 3 & 4 read the statements and comments in call() method.
    }
}
