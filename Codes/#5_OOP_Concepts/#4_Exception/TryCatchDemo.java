
// Author: Abadhesh Mishra [Employee Id: 8117322]

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("all")
public class TryCatchDemo {
    public static void main(String[] args) { 

        /*
             "try-catch-finally" block:
             --------------------------
              try
              {
                // The code which may generate exception is put here.
              } 
              catch (Exception e) 
              {
                // Code to be executed if any exception occours in 'try' block is put here.
                // If no exception occours in 'try' block, this block is skipped.
                // 'e' is the exception object caught by catch block.      
              }
              finally
              {
                // Code must be executed whether exception occours or not is put here.
                // This block is not mandatory.
              }
        */


        // In the below statement, "FileReader()" constructor throws "FileNotFoundException".
         File file = new File("MyText.txt");
         try {
            FileReader fReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.err.println("\nSorry! :(\nFile Not Found!\n");
        }

        // In the below statement, "getConnection()" throws "SQLException".
        try {
            Connection connection = DriverManager.getConnection(null);
        } catch (SQLException e) {
            System.err.println("\nSorry! :(\nNull URL!\n");
        } finally {
            // This block is not mandatory.
            System.out.println("\nException generated successfully! :)\n");
        }
    }
}
