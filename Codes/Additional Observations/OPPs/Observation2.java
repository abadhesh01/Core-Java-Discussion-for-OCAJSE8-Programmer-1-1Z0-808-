
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
   Note:
   -----
   An abstract class can extend a concreate class and override it's method(s) as 
   abstract method(s) or concreate method(s).
*/

interface MyInteface
{
    //abstract // Optional
    public void show(); 
}

abstract class MySample implements MyInteface
{
    //@Override abstract public void show(); // Optional
}

@SuppressWarnings("all")
class MySample2 
extends MySample // Optional if "implements MyInteface" is not commented. 
implements MyInteface  // Optional if "extends MySample" is not commented.
{
    @Override public void show(){ System.out.println("show() implemented in MySample2."); };
}

abstract
@SuppressWarnings("all")
public class Observation2
extends MySample2  // Optional if "implements MyInteface" is not commented.
implements MyInteface // Optional if "extends MySample2" is not commented.
{
    // Either of the one show() method can be uncommented but, not the both.
    @Override public abstract void show();
    //@Override public void show() { System.out.println("show() implemented in Observation2."); }

	public static void main(String[] args) {
        System.out.println("\n\n");
        new MySample2().show();
		System.out.println("Execution successful. :)\n\n");
	}
}
