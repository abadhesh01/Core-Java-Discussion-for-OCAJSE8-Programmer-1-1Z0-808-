
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CompileTimeException {

    /* 
       "throws" keyword:
       -----------------
       -> The 'throws' clause is used to throw an exception from the method
          to the caller of the method rather than handling it within the method.

       -> It can throw multiple exceptions.   

       -> Here JVM is the caller of main() method.  
    */ 

    @SuppressWarnings("all")
    public static void main(String[] args) throws FileNotFoundException, SQLException {
        
        /* 
           -> "java.lang.FileNotFoundException" and "java.lang.SQLException" are some of the
               Compiletime Exceptions/ Checked Exceptions.
           -> "The compiler forces to handle the compiletime exception / checked exception.    
        */

        // In the below statement, "FileReader()" constructor throws "FileNotFoundException".
        File file = new File("MyText.txt");
        FileReader fReader = new FileReader(file);
        
        // In the below statement, "getConnection()" throws "SQLException".
        Connection connection = DriverManager.getConnection(null);

    }
}
