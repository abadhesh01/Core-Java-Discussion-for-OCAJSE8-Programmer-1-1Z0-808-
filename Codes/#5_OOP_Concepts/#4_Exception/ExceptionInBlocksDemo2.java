import java.io.IOException;

// Author: Abadhesh Mishra [Employee Id: 8117322]

/*
     Observation:
     ------------
     -> (1) As java forces to handle or throw checked exceptions, if we do not
            handle or throw checked exception, it will show compile time error.
     
        (2) For successful compilation, the checked exception must be handled 
            inside the "static" block as well as inside the non-"static" block
            also.
          * The checked exceptions must be handled inside the "static" block using
            try-catch block.
          * The checked exceptions inside the non-"static" block should be handled
            either by surrounding the code using ty-catch block or throw the exception
            from non-static block and declare the exception in constructor using "throws"
            keyword. 
               
                 
     -> Checked exceptions must be handled inside "static" and/or non-"static" block
        using try-catch block otherwise, the program will crash during runtime.
*/  

public class ExceptionInBlocksDemo2 {

    // "static" block 1
    static{
        try {
            new ExceptionInBlocksDemo2().thetaFunction();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // non-"static" block 1
    {
        try {
            this.thetaFunction();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // "static" block 2
    static
    {
        // Compilation Error: Checked exception must be handled using try-catch block
        // inside a "static" block.
        //new ExceptionInBlocksDemo2().thetaFunction();
    }

    // non-"static" block 2
    {
        this.thetaFunction();
    }

    // non-"static" block 3
    {
        this.thetaFunction();
    }

    public void thetaFunction() throws IOException 
    {
        throw new IOException("My Theta Exception");         
    }

    public ExceptionInBlocksDemo2() throws IOException
    {        
        super();
    }
    
    public static void main(String[] args) throws IOException {
        new ExceptionInBlocksDemo2();
    }
}
