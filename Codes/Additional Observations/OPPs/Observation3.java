
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
    Note:
    -----
    -> A class can extend anathor class.
    
    -> An interface can extend one or more intefaces.

    -> A class can implement one or more interfaces.

    -> Two or more unrelated interfaces having duplicate default methods with same return type only
       can be extended by anathor interface but, the condition is the child inteface must override
       the default method(s) of it's parent interfaces (which if not done will result in compilation error).

       [For observation, comment out the @Override annotation of display() method and display() 
       method in interface Charlie. You will see a compilation error. Then for successful 
       compilation, uncomment the @Override annotation and display() method in interface 
       Charlie.]
       
    -> Two or more unrelated interfaces having duplicate default methods with same return type only
       can be implemented by a class but, the condition is the class must override
       the default method(s) of it's parent interfaces (which if not done will result in compilation error).  

       [For observation, comment out the @Override annotation of display() method and display() 
       method in class Delta. You will see a compilation error. Then for successful 
       compilation, uncomment the @Override annotation and display() method in class
       Delta.]

    -> Two or more unrelated interfaces having duplicate abstract methods with same return type 
       only can be extended by anathor interface as well as can be implemented by anathor class 
       also and will compile successfully.

       [For observation, comment out the display() method in interface Alpha and Bravo and
       comment out the @Override annotation of display() method in interface Charlie and class Delta
       and after observation uncomment them.]

    -> The parent interface(s) of an implemented interface can be implemented but, it's optional
       and will make the code redundant and also useless. The implemented interface dominates over 
       it's parent interface(s).

       [1. Comment out "Alpha" in "implements" in "Observation3" class and observe 
           and then uncomment.
        2. Comment out "Bravo" in "implements" in "Observation3" class and observe 
           and then uncomment.
        3. Comment out both "Alpha" and "Bravo" in "implements" in "Observation3" class and observe 
           and then uncomment.]
*/

interface Alpha 
{
    void show();
    
    default void display() {System.out.println("display() in interface Alpha.");}
}

interface Bravo 
{
    void show();
    
    default void display() {System.out.println("display() in interface Bravo.");}
}

interface Charlie extends Alpha, Bravo
{
    @Override void show(); // Optional
    
    @Override 
    default void display(){System.out.println("display() in interface Charlie.");}
}

abstract class Delta implements Alpha, Bravo
{
    @Override public abstract void show(); // Optional

    @Override 
    public void display(){System.out.println("display() in class Delta.");}
}

@SuppressWarnings("all")
public class Observation3 implements   
Alpha, // Useless as it has been implemented by 'Charlie'.
Bravo, // Useless as it has been implemented by 'Charlie'.
Charlie  
{

	public static void main(String[] args) {
        System.out.println("\n\n");
        Observation3 observation3 = new Observation3();
        observation3.show();
        observation3.display();
		System.out.println("Execution Successful. :)\n\n");
	}

    @Override
    public void show() {
        System.out.println("show() implemented.");       
    }
}
