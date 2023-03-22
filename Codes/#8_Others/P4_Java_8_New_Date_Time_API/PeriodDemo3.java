
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.Period;

public class PeriodDemo3 {

  public static void displayPeriod(String text)
  {
      try {
        /*
          Note:
          -----
          -> The order of 'String' matters. It must be in the order of Year-Month-Date format.
        */
        System.out.println(/*Parsing 'String' into period here.*/Period.parse(text));
      } catch (Exception e) {
        System.out.println(e.getClass().getName());
      }
  }  

  public static void main(String[] args) {

      // 'Period' class is immutable.
      // Reference: https://docs.oracle.com/javase/8/docs/api/java/time/Period.html
      

      System.out.println("\n\n");

      displayPeriod("P10Y10M10D"); // Output: P10Y10M10D
      displayPeriod("-P33Y33M33D"); // Output: P-33Y-33M-33D
      displayPeriod("-p-555y-555M-555d"); // Output: P555Y555M555D
      displayPeriod("p70y-35M-22d"); // Output: P70Y-35M-22D
      displayPeriod("-p70y-35M-22d"); // Output: P-70Y35M22D
      displayPeriod("p-70M-20D"); // Output: P-70M-20D
      displayPeriod("P10Y22M"); // Output: P10Y22M
      displayPeriod("-P-100000M"); // Output: P100000M

      System.out.println();

      displayPeriod("10W"); // Output: java.time.format.DateTimeParseException
      displayPeriod("P10M1Y1D"); // Output: java.time.format.DateTimeParseException
      displayPeriod("Invalid String"); // Output: java.time.format.DateTimeParseException
      displayPeriod(null); // Output: java.lang.NullPointerException

      System.out.println("\n\n");  
  }    
}
