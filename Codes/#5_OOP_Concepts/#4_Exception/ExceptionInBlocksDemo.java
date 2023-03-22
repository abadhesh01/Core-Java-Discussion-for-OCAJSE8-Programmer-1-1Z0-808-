
// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     Observation:
     ------------
     -> As java does not forces to handle or throw unchecked exceptions, if we do not
        handle or throw unchecked exception, it will compile successfully. 

     -> Unchecked exceptions must be handled inside "static" and/or non-"static" block
        using try-catch block otherwise, the program will crash during runtime.
*/  

public class ExceptionInBlocksDemo {

    // "static" block 1
    static {
        // Handling unchecked exception inside "static" block.
        try{
            new ExceptionInBlocksDemo().gammaFunction();
        } catch(Exception e) {
             System.out.println(e.getMessage());
        }    
    }
    
    // non-"static" block 1
    {
        // Handling unchecked exception inside non-"static" block.
        try{
             this.gammaFunction();
        } catch(Exception e) {
             System.out.println(e.getMessage());
        }
    }

    // "static" block 2
    static
    {
        // Not handling unchecked exception inside "static" block.
        new ExceptionInBlocksDemo().gammaFunction();
    }

    // non-"static" block 2
    {
        // Not handling unchecked exception inside non-"static" block.
        this.gammaFunction();
    }

    public void gammaFunction() throws RuntimeException
    {
        throw new RuntimeException("My Gamma Exception");
    }

    public static void main(String[] args) {
        new ExceptionInBlocksDemo();                 
    }

}
