
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
   Summary:
   --------
   [1] The parent class default constructor implicitly calls the child class default constructor.
   [2] The parent class parameterized constructor also implicitly calls the child class default constructor.
*/

// Multilevel Inheritance
class Sample1
{    
      Sample1()
      {
        System.out.println("Sample1 Default Constructor");
      }  
}

class Sample2 extends Sample1
{  
    Sample2()
    {
        System.out.println("Sample2 Default Constructor");
    } 

    Sample2(String text)
    {
        System.out.println("Sample2 Parameterized Constructor");
    }
}

class Sample3 extends Sample2
{
    Sample3()
    {
        System.out.println("Sample3 Default Constructor");
    }

    Sample3(String text)
    {
        System.out.println("Sample3 Parameterized Constructor");
    }
}

public class InheritanceDemo
{
   public static void main(String[] args) {
      
      new Sample3(); // Orphan Object.
      System.out.println("---------------------------------");
      new Sample2(); // Orphan Object.
      System.out.println("---------------------------------");
      new Sample3(null); // Orphan Object.
      System.out.println("---------------------------------");
      new Sample2(null); // Orphan Object.
   }
}