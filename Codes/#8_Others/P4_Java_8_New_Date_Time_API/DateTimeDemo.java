
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {

        /*
            Note:
            -----
            -> 'LocalDate', 'LocalTime' and 'LocalDateTime' classes are immutable classes.
           
            -> For more refer:
           
               LocalDate: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
               
               LocalTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html

               LocalDateTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
        */

        System.out.println("\n\n");
        
        LocalDate date = LocalDate.now(); // Current Date
        LocalTime time = LocalTime.now(); // Current Time
        LocalDateTime dateTime = LocalDateTime.now(); // Current Date and Time 

        System.out.println(date); // Output: 2023-03-17
        System.out.println(time); // Output: 16:52:20.742308
        System.out.println(dateTime); // Output: 2023-03-17T16:52:20.742308

        date.plusDays(10).plusMonths(10).plusYears(10);
        
        time.plusHours(3).plusMinutes(3).plusSeconds(3);
       
        dateTime.plusDays(10).plusMonths(10).plusYears(10)
                .plusHours(3).plusMinutes(3).plusSeconds(3);;

        System.out.println("\n"+date); // Output: 2023-03-17
        System.out.println(time); // Output: 16:52:20.742308
        System.out.println(dateTime); // Output: 2023-03-17T16:52:20.742308


        System.out.println("\n\n");

    }    
}
