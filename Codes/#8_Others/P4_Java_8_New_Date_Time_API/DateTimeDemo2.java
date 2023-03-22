
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeDemo2 {
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

       LocalDate date = null;
       System.out.println(LocalDate.of(2021, 8, 31)); // Output: 2021-08-31
       System.out.println(date = LocalDate.of(2020, Month.JUNE, 30)); // Output: 2020-06-30

       LocalTime time = LocalTime.of(12, 0, 0);
       System.out.println(time); // Output: 12:00

       LocalDateTime dateTime = LocalDateTime.of(date, time);
       LocalDateTime dateTime2 = dateTime.plusWeeks(49).plusWeeks(-1).plus(Period.ZERO);
       LocalDateTime dateTime3 = dateTime.minusWeeks(49).minusWeeks(-1).plus(Period.ZERO);
       
       System.out.println(dateTime); // Output: 2020-06-30T12:00
       System.out.println(dateTime2); // Output: 2021-06-01T12:00
       System.out.println(dateTime3); // Output: 2019-07-30T12:00

       System.out.println(dateTime.isBefore(dateTime2)); // Output: true
       System.out.println(dateTime.isAfter(dateTime3)); // Output: true

       System.out.println("\n\n");
   }  
}
