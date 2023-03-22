
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
   Note:
   -----
   -> The "static" method of extended class can be called either directly 
      or through extended class name.
   -> The "static" method of implemented interface can be called through
      implemented interface name only.   
*/

class Beta
{
  static void show()
  {
    System.out.println("show() from class Beta.");  
  }
}

interface Theta
{
    static void printText()
    {
        System.out.println("printText() from interface Theta.");
    }
}

interface Gamma extends Theta
{
  static void display()
  {
    //printText(); // Compilation Error
    Theta.printText();
    System.out.println("display() from interface Gamma.");  
  } 
}

public class Observation1
extends Beta
implements Gamma
{
	public static void main(String[] args) {
      System.out.println("\n\n");

	    show();
      Beta.show();

	    //display(); // Compilation Error
	    Gamma.display();

		System.out.println("Execution Successful. :)\n\n");
  }
}
