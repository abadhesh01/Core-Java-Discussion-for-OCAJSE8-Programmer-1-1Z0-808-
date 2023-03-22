
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {

    public static void formatDateTime(String format)
    {
        // This method formats a 'LocalDateTime' object into a valid format.
        LocalDateTime dateTime = LocalDateTime.now();
        try {
            // The below line formats the 'LocalDateTime' object into a 'String' object. 
            String text = dateTime.format(DateTimeFormatter.ofPattern(format));
            System.out.println(text);
        }  catch (Exception e) {System.out.println(e.getClass().getName());}
    }

    public static void main(String[] args) {

          /*
            Note:
            -----
            -> 'LocalDate', 'LocalTime' and 'LocalDateTime' classes are immutable classes.
           
            -> For more refer:
           
               LocalDate: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
               
               LocalTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html

               LocalDateTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html

               DateTimeFormatter: 
               [1] https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
               
               [2] https://www.baeldung.com/java-datetimeformatter
            
        */
        
        System.out.println("\n");

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        // Formatting 'LocalDate' object.
        try {
            System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        } catch (Exception e) {System.out.println(e.getClass().getName());}

        try {
            System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_TIME));
        } catch (Exception e) {System.out.println(e.getClass().getName());}
        // Exception: 'LocalDate' does not have time included.

        try {
            System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        }  catch (Exception e) {System.out.println(e.getClass().getName());}
        // Exception: 'LocalDate' does not have time included.



        System.out.println();
        // Formating 'LocalTime' object.
        try {
            System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE));
        } catch (Exception e) {System.out.println(e.getClass().getName());}
        // Exception: 'LocalTime' does not have date included.
        
        try {
            System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        } catch (Exception e) {System.out.println(e.getClass().getName());}

        try {
            System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        }  catch (Exception e) {System.out.println(e.getClass().getName());}
        // Exception: 'LocalTime' does not have date included.



        System.out.println();
        // Formatting 'LocalDateTime' object.
        try {
            System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        } catch (Exception e) {System.out.println(e.getClass().getName());}

        try {
            System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        } catch (Exception e) {System.out.println(e.getClass().getName());}

        try {
            System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        }  catch (Exception e) {System.out.println(e.getClass().getName());}

        System.out.println();
        // Custom Formatting of 'LocalDateTime'.
        /*
           Note-2:
           -------
           h -> Hour
           m -> Minute
           s -> Second
           y -> Year
           M -> Month
           d -> Day
        */

        formatDateTime("hh:mm:ss @ dd/MMM/YYYY");
        formatDateTime("hh:mm:ss @ dd/MMMM/YYYY");
        formatDateTime("hh:mm:ss @ dd/MM/YYYY");
        formatDateTime("h:m:s @ dd/MM/YY");
        formatDateTime("h:m:s @ d/M/Y");
        formatDateTime("D = h:m:s, T = d/M/Y"); // Exception: Invalid format.
        formatDateTime(null); // Exception: java.lang.NullPointerException
        
        System.out.println("\n");
    }
}
