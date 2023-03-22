
// Author: Abadhesh Mishra [Employee Id: 8117322]

package P4_Java_8_New_Date_Time_API;

import java.time.Period;

public class PeriodDemo2 {
    public static void main(String[] args) {

        // 'Period' class is immutable.
        // Reference: https://docs.oracle.com/javase/8/docs/api/java/time/Period.html
        
        System.out.println("\n\n");

        Period period = Period.of(5, 5, 5);
        System.out.println(period);  // Output: P5Y5M5D

        period.plusDays(-1).plusMonths(1).plusYears(-1);
        System.out.println(period); // Output: P5Y5M5D

        period = period.plusDays(-1).plusMonths(1).plusYears(-1);
        System.out.println(period); // Output: P4Y6M4D

        period = period.minusDays(-2).minusMonths(2).minusYears(-2);
        System.out.println(period); // Output: P6Y4M6D

        period = Period.ofWeeks(-100);
        System.out.println(period); // Output: P-700D

        System.out.println(Period.ofYears(0)); // Output: P0D
        System.out.println(Period.ofMonths(0)); // Output: P0D
        System.out.println(Period.ofWeeks(0)); // Output: P0D

        System.out.println("\n\n");
    }
}
