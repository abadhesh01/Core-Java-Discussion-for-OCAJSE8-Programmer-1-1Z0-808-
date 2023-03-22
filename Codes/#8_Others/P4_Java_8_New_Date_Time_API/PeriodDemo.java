
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.Period;

@SuppressWarnings("all")
public class PeriodDemo {
   public static void main(String[] args) {

        // 'Period' class is immutable. 
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/time/Period.html
   
        System.out.println("\n\n");
        
        Period period = null;
        System.out.println(period); // Output: null

        period.of(0, 0, 0);
        System.out.println(period); // Output: null

        period = period.of(0, 0, 0);
        System.out.println(period); // Output: P0D

        period = period.ofDays(600);
        System.out.println(period); // Output: P600D

        period = period.ofMonths(-200);
        System.out.println(period); // Output: P-200M

        period = period.ofYears(-300);
        System.out.println(period); // Output: P-300Y
        
        period = period.ofWeeks(10);
        System.out.println(period); // Output: P70D
        
        System.out.println(Period.of(10, -18, 5).ofWeeks(-7)); // Output: P-49D

        System.out.println(Period.ofYears(10).ofWeeks(-48)); // Output: P-336D 

        System.out.println(Period.of(10, -18, 5)); // Output: P10Y-18M5D

        System.out.println("\n\n");
   }    
}
