
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo3 {
 
    public static void parseDate(String text)
    {
        // This method parses a valid 'String' object to 'LocalDate' object.
        try {
            System.out.println(/*Parsing date here.*/LocalDate.parse(text));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }

    public static void parseTime(String text)
    {
        // This method parses a valid 'String' object to 'LocalTime' object.
        try {
            System.out.println(/*Parsing time here.*/LocalTime.parse(text));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }

    public static void parseDateTime(String text)
    {
        // This method parses a valid 'String' object to 'LocalDateTime' object.
        try {
            System.out.println(/*Parsing date and time here.*/LocalDateTime.parse(text));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\n");

        /*
            Note-1:
            -------
            -> 'LocalDate', 'LocalTime' and 'LocalDateTime' classes are immutable classes.
           
            -> For more refer:
           
               LocalDate: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
               
               LocalTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html

               LocalDateTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
        */


        /*
            Note-2:
            -------
            -> For parsing 'String' to 'LocalDate', the valid text format is
               "YYYY-MM-DD".
               
            -> For parsing 'String' to 'LocalTime', the vaild text formats are
               1. "HH:MM:SS.MS", wehre MS is of 9 digits or less.
               2. "HH:MM:SS"
               3. "HH:MM"   

            -> For parsing 'String' to 'LocalDateTime', the vaild text formats are
               1. "YYYY-MM-DDTHH:MM:SS.MS", wehre MS is of 9 digits or less.
               2. "YYYY-MM-DDTHH:MM:SS"
               3. "YYYY-MM-DDTHH:MM"
               4. "YYYY-MM-DDtHH:MM:SS.MS", wehre MS is of 9 digits or less.
               5. "YYYY-MM-DDtHH:MM:SS"
               6. "YYYY-MM-DDtHH:MM"   
        */ 

        parseDate("2021-08-31");

        parseTime("01:30");
        parseTime("01:30:30");
        parseTime("01:30:30.999999999");
        
        parseDateTime("2021-08-31t01:30");
        parseDateTime("2021-08-31t01:30:30");
        parseDateTime("2021-08-31T01:30:30.999999999");

        parseDate("2021-8-31"); // Output: java.time.format.DateTimeParseException
        parseTime("1:30:30"); // Output: java.time.format.DateTimeParseException
        parseDateTime("2021-8-31t01:3:3"); // Output: java.time.format.DateTimeParseException

        System.out.println("\n\n");
    }
}
