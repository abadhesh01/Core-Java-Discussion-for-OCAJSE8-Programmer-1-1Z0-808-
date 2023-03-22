
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class InfoExtractionDemo {
   public static void main(String[] args) {

     /*
            Note:
            -----
            -> 'Period', 'LocalDate', 'LocalTime' and 'LocalDateTime' classes are immutable classes.
           
            -> For more refer:

               Period: https://docs.oracle.com/javase/8/docs/api/java/time/Period.html
           
               LocalDate: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
               
               LocalTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html

               LocalDateTime: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
     */

    System.out.println("\n");

    Period period = Period.of(10, 120, 120 * 30);
    System.out.println("Period: " + period);
    System.out.println("Days in Period: " + period.getDays());
    System.out.println("Months in Period: " + period.getMonths());
    System.out.println("Years in Period: " + period.getYears());

    LocalDate date = LocalDate.of(1999, Month.APRIL, 3);
    LocalTime time =  LocalTime.of(13, 45, 35);
    LocalDateTime dateTime = LocalDateTime.of(date, time);

     System.out.println("\nDate and Time: " + dateTime);
     System.out.println("Day of Week: " + dateTime.getDayOfWeek());
     System.out.println("Day of Month: " + dateTime.getDayOfMonth());
     System.out.println("Day of Year: " + dateTime.getDayOfYear());
     System.out.println("Month: " + dateTime.getMonth());
     System.out.println("Month Value: " + dateTime.getMonthValue());
     System.out.println("Year: " + dateTime.getYear());
     System.out.println("Hour " + dateTime.getHour());
     System.out.println("Minute " + dateTime.getMinute());
     System.out.println("Second: " + dateTime.getSecond());

    System.out.println("\n");
   }
}
