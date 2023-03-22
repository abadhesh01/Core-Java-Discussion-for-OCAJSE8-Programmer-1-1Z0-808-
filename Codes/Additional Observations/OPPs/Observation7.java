
// Author: Abadhesh Mishra [Employee Id: 8117322]

/* 
    Note: 
    -----    
    Throwing 'null' will always result in 'java.lang.NullPointerException'
    no matter whatever the 'throws' declaration is.                              
*/

import java.io.IOException;
import java.sql.SQLException;

@SuppressWarnings("all")
public class Observation7 {

  // Throwing 'null' directly.  

  static void fun1()
  {
     throw null; // 'null' can be thrown without any 'throws' declaration.
  }

  static void fun2() throws RuntimeException
  {
     throw null;
  }

  static void fun3() throws IOException
  {
     throw null;
  }

  static void fun4() throws SQLException
  {
     throw null;
  }

  static void fun5() throws Exception
  {
     throw null;
  }

  static void fun6() throws Throwable
  {
     throw null;
  }

  // Throwing 'null' through object reference.

  static void fun101()
  {
     Error error = null;
     throw error;
  }

  static void fun102() throws RuntimeException
  {
    RuntimeException runtimeException = null;
    throw runtimeException;
  }

  static void fun103() throws IOException
  {
     IOException ioException = null;
     throw ioException;
  }

  static void fun104() throws SQLException
  {
     SQLException sqlException = null;
     throw sqlException;
  }

  static void fun105() throws Exception
  {
     Exception exception = null;
     throw exception;
  }

  static void fun106() throws Throwable
  {
     Throwable throwable = null;
     throw throwable;
  }

  static void fun107() throws Exception
  {
      ArithmeticException arithmeticException = null;
      throw arithmeticException;
  }
  

   public static void main(String[] args) throws Exception {

    // Catching 'null' thrown directly.       
        
           for(int count = 1; count <= 6; count ++)
           {
               try{

                 if(count == 1)
                    fun1();
                
                 if(count == 2)
                    fun2();   

                 if(count == 3)
                    fun3();
                    
                 if(count == 4)
                    fun4();

                 if(count == 5)
                    fun5();
                    
                 if(count == 6)
                    fun6();

               } catch (Throwable t) {
                System.out.println("\nCount => " + count + ":\n" + t 
                + "\nClass Name ---> " + t.getClass().getName() 
                + "\nMessage ---> " + t.getMessage() + "\n");
               }        
           }

    // Catching 'null' thrown by object reference.

           for(int count = 101; count <= 107; count ++)
           {
               try{

                 if(count == 101)
                    fun101();
                
                 if(count == 102)
                    fun102();   

                 if(count == 103)
                    fun103();
                    
                 if(count == 104)
                    fun104();

                 if(count == 105)
                    fun105();
                    
                 if(count == 106)
                    fun106();

                 if(count == 107)
                    fun107();   

               } catch (Throwable t) {
                System.out.println("\nCount => " + count + ":\n" + t 
                + "\nClass Name ---> " + t.getClass().getName() 
                + "\nMessage ---> " + t.getMessage() + "\n");
               }        
           }
 
   }    
}
