
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     OUTPUT:
     -------
     
     sampleFunctionA(): java.io.IOException
     sampleFunctionB(): java.io.IOException
     sampleFunctionC(): java.io.IOException
     sampleFunctionD(): java.io.IOException
     sampleFunctionE(): java.io.IOException
     sampleFunctionF(): Exception
     sampleFunctionG(): Exception
     
*/

public class Observation10 {

    public static void sampleFunctionA() throws java.io.IOException
    {
           throw new java.io.IOException();
    }

    public static void sampleFunctionB() throws Exception
    {
           throw new java.io.IOException();
    }

    public static void sampleFunctionC() throws java.io.IOException, Exception
    {
           throw new java.io.IOException();
    }

    public static void sampleFunctionD() throws Exception
    {
           throw (Exception) new java.io.IOException();
    }

    public static void sampleFunctionE() throws java.io.IOException, Exception
    {
           throw (Exception) new java.io.IOException();
    }

    public static void sampleFunctionF() throws Exception
    {
           throw null;
    }

    public static void sampleFunctionG() throws Exception
    {
           throw (Exception) null;
    }

    public static void main(String[] args) {

        System.out.println("\n\n");

        try {sampleFunctionA();} 
        catch (java.io.IOException e) 
        {System.out.println("sampleFunctionA(): java.io.IOException");}
        catch (Exception e) 
        {System.out.println("sampleFunctionA(): Exception");}


        try {sampleFunctionB();} 
        catch (java.io.IOException e) 
        {System.out.println("sampleFunctionB(): java.io.IOException");}
        catch (Exception e) 
        {System.out.println("sampleFunctionB(): Exception");}
        
        
        try {sampleFunctionC();} 
        catch (java.io.IOException e) 
        {System.out.println("sampleFunctionC(): java.io.IOException");}
        catch (Exception e) 
        {System.out.println("sampleFunctionC(): Exception");}
    
       
        try {sampleFunctionD();} 
        catch (java.io.IOException e) 
        {System.out.println("sampleFunctionD(): java.io.IOException");}
        catch (Exception e) 
        {System.out.println("sampleFunctionD(): Exception");}


        try {sampleFunctionE();} 
        catch (java.io.IOException e) 
        {System.out.println("sampleFunctionE(): java.io.IOException");}
        catch (Exception e) 
        {System.out.println("sampleFunctionE(): Exception");}


        try {sampleFunctionF();} 
        catch (java.io.IOException e) 
        {System.out.println("sampleFunctionF(): java.io.IOException");}
        catch (Exception e) 
        {System.out.println("sampleFunctionF(): Exception");}


        try {sampleFunctionG();} 
        catch (java.io.IOException e) 
        {System.out.println("sampleFunctionG(): java.io.IOException");}
        catch (Exception e) 
        {System.out.println("sampleFunctionG(): Exception");}


        try{}catch(Exception e){}
        try{}catch(Throwable e){}
        //try{}catch(java.io.IOException e){} // Compilation Error
        //try{}catch(java.sql.SQLException e){} // Compilation Error
        try{}catch(RuntimeException e){}
        try{}catch(NullPointerException e){}
        try{}catch(ArithmeticException e){}
        try{}catch(IndexOutOfBoundsException e){}

        System.out.println("\n\n");
    }
}
